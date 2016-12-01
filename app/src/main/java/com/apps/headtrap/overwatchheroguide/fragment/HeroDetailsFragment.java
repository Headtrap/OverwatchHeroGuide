package com.apps.headtrap.overwatchheroguide.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.adapter.AbilitiesAdapter;
import com.apps.headtrap.overwatchheroguide.domain.Hero;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeroDetailsFragment extends BaseFragment {
    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private AbilitiesAdapter adapter;
    private Hero hero;

    public HeroDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hero_details, container, false);

        hero = (Hero) getArguments().getSerializable("hero");

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewAbilities);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter = new AbilitiesAdapter(getContext(), hero.getHeroAbilities());
        recyclerView.setAdapter(adapter);

    }

}
