package com.apps.headtrap.overwatchheroguide.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.activity.MapDetailsActivity;
import com.apps.headtrap.overwatchheroguide.adapter.MapsAdapter;
import com.apps.headtrap.overwatchheroguide.domain.Map;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.apps.headtrap.overwatchheroguide.utils.HeroManager;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends BaseFragment implements MapsAdapter.MapCallback
{


    private RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private MapsAdapter adapter;
    private List<Map> maps;


    public MapsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewMaps);
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

    @Override
    public void onResume()
    {
        super.onResume();

        maps = HeroManager.getMaps();

        adapter = new MapsAdapter(getContext(), maps, MapsFragment.this);
        recyclerView.setAdapter(adapter);

    }


    @Override
    public void onClickMap(Map map, ImageView imageView)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("map", map);
        Intent intent = new Intent(getActivity(), MapDetailsActivity.class);
        intent.putExtras(bundle);

        ActivityOptionsCompat opts = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), imageView, Constants.KEY_TRANSITION_DETAILS);
        ActivityCompat.startActivity(getActivity(), intent, opts.toBundle());
    }
}
