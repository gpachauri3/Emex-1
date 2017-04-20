package com.example.gaurav.a_1.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.gaurav.a_1.fragments.JobHistoryFragment;
import com.example.gaurav.a_1.fragments.MissedJobFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                JobHistoryFragment jobHistoryFragment = new JobHistoryFragment();
                return jobHistoryFragment;
            case 1:
                MissedJobFragment missedJobFragment = new MissedJobFragment();
                return missedJobFragment;

            default:
                return null;

        }

    }


    @Override
    public int getCount() {
        return 2;
    }

}