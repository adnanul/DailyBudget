package com.dbbl.adnan.dailybudget.activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbbl.adnan.dailybudget.R;

/**
 * Created by Asus on 1/7/2018.
 */

public class FixturesFragment extends Fragment {

    public FixturesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_feature, container, false);

        return rootView;
    }

}