package com.apps.headtrap.overwatchheroguide.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.headtrap.overwatchheroguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AbilitiesFragment extends BaseFragment {


    public AbilitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abilities, container, false);
    }

}