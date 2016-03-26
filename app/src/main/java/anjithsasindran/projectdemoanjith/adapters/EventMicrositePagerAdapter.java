package anjithsasindran.projectdemoanjith.adapters;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import anjithsasindran.projectdemoanjith.fragments.MicrositeDescriptionFragment;
import anjithsasindran.projectdemoanjith.fragments.MicrositeKeySpeakersFragment;
import anjithsasindran.projectdemoanjith.fragments.MicrositeSponsorListFragment;
import anjithsasindran.projectdemoanjith.fragments.MicrositeTimelineFragment;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeDescription;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeKeySpeakers;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeSponsorsList;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeTimeline;

/**
 * Created by Anjith Sasindran
 * on 22-Mar-16.
 * FragmentPagerAdapter for EventMicrsoiteFragment
 */
public class EventMicrositePagerAdapter extends FragmentStatePagerAdapter {

    private final ArrayList<Object> micrositeViewPagerData;
    private final String tabTitles[];

    public EventMicrositePagerAdapter(FragmentManager fm, ArrayList<Object> micrositeViewPagerData) {
        super(fm);
        this.micrositeViewPagerData = micrositeViewPagerData;
        tabTitles = new String[this.micrositeViewPagerData.size()];
        tabTitles[0] = ((MicrositeKeySpeakers) this.micrositeViewPagerData.get(0)).getFirstHeader();
        tabTitles[1] = ((MicrositeTimeline) this.micrositeViewPagerData.get(1)).getFirstHeader();
        tabTitles[2] = ((MicrositeSponsorsList) this.micrositeViewPagerData.get(2)).getFirstHeader();
        tabTitles[3] = ((MicrositeDescription) this.micrositeViewPagerData.get(3)).getFirstHeader();
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle;
        switch (position) {
            case 0:
                MicrositeKeySpeakersFragment keySpeakersFragment = new MicrositeKeySpeakersFragment();
                bundle = new Bundle();
                bundle.putParcelable("data", (Parcelable) this.micrositeViewPagerData.get(position));
                keySpeakersFragment.setArguments(bundle);
                return keySpeakersFragment;
            case 1:
                MicrositeTimelineFragment timelineFragment = new MicrositeTimelineFragment();
                bundle = new Bundle();
                bundle.putParcelable("data", (Parcelable) this.micrositeViewPagerData.get(position));
                timelineFragment.setArguments(bundle);
                return timelineFragment;
            case 2:
                MicrositeSponsorListFragment sponsorsListFragment = new MicrositeSponsorListFragment();
                bundle = new Bundle();
                bundle.putParcelable("data", (Parcelable) this.micrositeViewPagerData.get(position));
                sponsorsListFragment.setArguments(bundle);
                return sponsorsListFragment;
            case 3:
                MicrositeDescriptionFragment descriptionFragment = new MicrositeDescriptionFragment();
                bundle = new Bundle();
                bundle.putParcelable("data", (Parcelable) this.micrositeViewPagerData.get(position));
                descriptionFragment.setArguments(bundle);
                return descriptionFragment;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}