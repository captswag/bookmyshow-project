package anjithsasindran.projectdemoanjith.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.adapters.EventsDiscoveryAdapter;
import anjithsasindran.projectdemoanjith.constants.Constants;
import anjithsasindran.projectdemoanjith.helpers.EventsListHelper;
import anjithsasindran.projectdemoanjith.helpers.JsonReaderFromAssets;
import anjithsasindran.projectdemoanjith.models.events.EventsModel;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 * EventDiscoveryFragment is the homepage of the application.
 * It has all the events displayed out in cards
 */
public class EventDiscoveryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_discovery_layout, container, false);
        RecyclerView eventsRecyclerView = (RecyclerView) view.findViewById(R.id.events_recycler_view);
        setUpEventsRecyclerView(eventsRecyclerView);
        return view;
    }

    public void setUpEventsRecyclerView(RecyclerView eventsRecyclerView) {

        String json = JsonReaderFromAssets.loadJson(getContext(), Constants.eventDiscoveryJson);

        if (json != null) {
            EventsModel eventsModel = new Gson().fromJson(json, EventsModel.class);

            eventsRecyclerView.setLayoutManager(new LinearLayoutManager(eventsRecyclerView.getContext()));
            eventsRecyclerView.setAdapter(new EventsDiscoveryAdapter(
                    EventsListHelper.setUpDataForEventsList(eventsModel.getData()), getContext(),
                    getActivity().getSupportFragmentManager()));
        } else {
            Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
        }
    }
}