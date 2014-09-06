package com.mob.bussig.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by Mackan on 2014-09-06.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position) {
            case 0:
                // Top Rated fragment activity
                //return new BusStopListFragment();
            case 1:
                // Games fragment activity
                //return new BusStopListFragment();
            case 2:
                // Movies fragment activity
                //return new BusStopListFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                //return getString(R.string.title_section1).toUpperCase(l);
            case 1:
                //return getString(R.string.title_section2).toUpperCase(l);
            case 2:
                //return getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}
