package anjithsasindran.projectdemoanjith.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.adapters.EventMicrositePagerAdapter;
import anjithsasindran.projectdemoanjith.constants.Constants;
import anjithsasindran.projectdemoanjith.helpers.ApiHelper;
import anjithsasindran.projectdemoanjith.helpers.EventsMicrositeDataHelper;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.EventMicrositeModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anjith Sasindran
 * on 22-Mar-16.
 * EventMicrositeFragment is inflated once a card from EventDiscoveryFragment is selected
 */
public class EventMicrositeFragment extends Fragment {

    View view;
    ImageView bannerImageView;
    Toolbar mToolbar;
    Bundle bundle;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    ProgressBar progressBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.event_microsite_layout, container, false);

        bannerImageView = (ImageView) view.findViewById(R.id.microsite_banner_image);
        mToolbar = (Toolbar) view.findViewById(R.id.microsite_toolbar);
        mViewPager = (ViewPager) view.findViewById(R.id.microsite_view_pager);
        mTabLayout = (TabLayout) view.findViewById(R.id.microsite_tab_layout);
        progressBar = (ProgressBar) view.findViewById(R.id.microsite_progress_bar);

        setHasOptionsMenu(true);
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (bundle.getParcelable("banner_image") != null)
            bannerImageView.setImageBitmap((Bitmap) getArguments().getParcelable("banner_image"));
        else
            Picasso.with(getContext()).load(bundle.getString("event_image_url")).into(bannerImageView);

        mToolbar.setTitle(bundle.getString("event_name"));

        setupDataFromServer();
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            getActivity().onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setupDataFromServer() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiHelper eventMicrositeApi = retrofit.create(ApiHelper.class);

        Call<EventMicrositeModel> micrositeModelCall = eventMicrositeApi.requestMicrositeEvents();

        micrositeModelCall.enqueue(new Callback<EventMicrositeModel>() {
            @Override
            public void onResponse(Call<EventMicrositeModel> call, Response<EventMicrositeModel> response) {
                if (getActivity() != null) {
                    if (response.isSuccessful()) {
                        EventsMicrositeDataHelper micrositeDataHelper = new EventsMicrositeDataHelper();
                        mViewPager.setAdapter(new EventMicrositePagerAdapter(getActivity()
                                .getSupportFragmentManager(),
                                micrositeDataHelper.setupDataForViewPager(response.body().getData())));
                        mTabLayout.setupWithViewPager(mViewPager);
                        progressBar.setVisibility(View.GONE);
                        mViewPager.setVisibility(View.VISIBLE);
                    } else {
                        Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<EventMicrositeModel> call, Throwable t) {
                if (getActivity() != null)
                    Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    public void setUpDataFromJson() {
//        String json = JsonReaderFromAssets.loadJson(getContext(), Constants.EVENT_MICROSITE_JSON);
//
//        if (json != null) {
//            EventMicrositeModel eventMicrositeModel = new Gson()
//                    .fromJson(json, EventMicrositeModel.class);
//
//            EventsMicrositeDataHelper micrositeDataHelper = new EventsMicrositeDataHelper();
//
//            mViewPager.setAdapter(new EventMicrositePagerAdapter(getActivity()
//                    .getSupportFragmentManager(),
//                    micrositeDataHelper.setupDataForViewPager(eventMicrositeModel.getData())));
//            mTabLayout.setupWithViewPager(mViewPager);
//        } else {
//            Toast.makeText(getContext(), "Failed to load data", Toast.LENGTH_SHORT).show();
//        }
//    }
}