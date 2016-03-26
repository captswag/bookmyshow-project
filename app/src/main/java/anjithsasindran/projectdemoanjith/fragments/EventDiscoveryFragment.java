package anjithsasindran.projectdemoanjith.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.adapters.EventsDiscoveryAdapter;
import anjithsasindran.projectdemoanjith.constants.Constants;
import anjithsasindran.projectdemoanjith.helpers.ApiHelper;
import anjithsasindran.projectdemoanjith.helpers.ConnectivityHelper;
import anjithsasindran.projectdemoanjith.helpers.EventsListHelper;
import anjithsasindran.projectdemoanjith.models.events.EventsModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 * EventDiscoveryFragment is the homepage of the application.
 * It has all the events displayed out in cards
 */
public class EventDiscoveryFragment extends Fragment {

    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_discovery_layout, container, false);

        progressBar = (ProgressBar) view.findViewById(R.id.events_progress_bar);
        LinearLayout noNetworkLayout = (LinearLayout) view.findViewById(R.id.events_no_network);
        RecyclerView eventsRecyclerView = (RecyclerView) view.findViewById(R.id.events_recycler_view);

        if (ConnectivityHelper.isNetworkAvaiable(getContext()))
            setUpEventsRecyclerViewFromNetwork(eventsRecyclerView);
        else {
            noNetworkLayout.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.GONE);
        }

        return view;
    }

    public void setUpEventsRecyclerViewFromNetwork(final RecyclerView eventsRecyclerView) {
        /*
        Sending HTTP Request to server, and getting response.
        */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiHelper eventDisoveryApi = retrofit.create(ApiHelper.class);

        Call<EventsModel> eventsModelCall = eventDisoveryApi.requentDiscoveryEvents();

        eventsModelCall.enqueue(new Callback<EventsModel>() {
            @Override
            public void onResponse(Call<EventsModel> call, Response<EventsModel> response) {
                if (getActivity() != null) {
                    if (response.isSuccessful()) {
                        eventsRecyclerView.setLayoutManager(new LinearLayoutManager(eventsRecyclerView.getContext()));
                        eventsRecyclerView.setAdapter(new EventsDiscoveryAdapter(
                                EventsListHelper.setUpDataForEventsList(response.body().getData()), getContext(),
                                getActivity().getSupportFragmentManager()));
                        progressBar.setVisibility(View.GONE);
                        eventsRecyclerView.setVisibility(View.VISIBLE);
                    } else {
                        Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<EventsModel> call, Throwable t) {
                if (getActivity() != null)
                    Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
            }
        });
    }
//    public void setupEventsRecyclerViewFromAssets(RecyclerView eventsRecyclerView) {
//        String json = JsonReaderFromAssets.loadJson(getContext(), Constants.EVENT_DISCOVERY_JSON);
//
//        if (json != null) {
//            EventsModel eventsModel = new Gson().fromJson(json, EventsModel.class);
//
//            eventsRecyclerView.setLayoutManager(new LinearLayoutManager(eventsRecyclerView.getContext()));
//            eventsRecyclerView.setAdapter(new EventsDiscoveryAdapter(
//                    EventsListHelper.setUpDataForEventsList(eventsModel.getData()), getContext(),
//                    getActivity().getSupportFragmentManager()));
//        } else {
//            Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
//        }
//    }
}