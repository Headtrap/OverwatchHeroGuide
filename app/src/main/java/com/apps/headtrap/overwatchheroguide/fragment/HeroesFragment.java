package com.apps.headtrap.overwatchheroguide.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.activity.HeroDetailsActivity;
import com.apps.headtrap.overwatchheroguide.adapter.HeroesAdapter;
import com.apps.headtrap.overwatchheroguide.domain.Hero;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.apps.headtrap.overwatchheroguide.utils.HeroManager;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesFragment extends BaseFragment implements HeroesAdapter.HeroCallback
{
    private RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private HeroesAdapter adapter;
    private List<Hero> heroes;


    public HeroesFragment()
    {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_heroes, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewHeroes);
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Log.e("e","e");

        return view;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        heroes = HeroManager.getHeroes();
        adapter = new HeroesAdapter(getContext(), heroes, HeroesFragment.this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClickHero(Hero hero, ImageView imageView)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("hero", hero);
        Intent intent = new Intent(getActivity(), HeroDetailsActivity.class);
        intent.putExtras(bundle);

        ActivityOptionsCompat opts = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), imageView, Constants.KEY_TRANSITION_DETAILS);
        ActivityCompat.startActivity(getActivity(), intent, opts.toBundle());


    }
}