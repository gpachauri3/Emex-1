package com.example.gaurav.a_1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gaurav.a_1.R;
import com.example.gaurav.a_1.adapter.PagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    private  ViewPager mViewPager;
    private  PagerAdapter mPagerAdapter;
    Button missedJobs,jobHistory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=(inflater.inflate(R.layout.fragment_home, container, false));
        mViewPager=(ViewPager)view.findViewById(R.id.viewpager);
        missedJobs=(Button) view.findViewById(R.id.missed_jobs);
        jobHistory=(Button) view.findViewById(R.id.job_history);
        mPagerAdapter = new PagerAdapter(getFragmentManager(), getActivity());
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    missedJobs.setBackgroundResource(R.color.buttonBackground);
                    jobHistory.setBackgroundResource(R.color.colorPrimaryDark);

                } else {
                    jobHistory.setBackgroundResource(R.color.buttonBackground);
                    missedJobs.setBackgroundResource(R.color.colorPrimaryDark);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return view;
    }

}
