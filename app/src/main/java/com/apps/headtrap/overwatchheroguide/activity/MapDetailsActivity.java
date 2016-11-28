package com.apps.headtrap.overwatchheroguide.activity;


import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.domain.Map;

public class MapDetailsActivity extends CollapsingToolbarActivity
{
    private Map map;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        initViews();

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeButtonEnabled(true);
        }

        map = (Map) getIntent().getExtras().getSerializable("map");
        if (map != null)
        {
            setAppBarImage(map.getMapPicture());
            setAppBarTitle(map.getMapName());
        }
    }
}
