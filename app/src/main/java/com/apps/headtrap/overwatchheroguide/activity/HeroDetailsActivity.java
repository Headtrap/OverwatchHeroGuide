package com.apps.headtrap.overwatchheroguide.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.domain.Hero;
import com.apps.headtrap.overwatchheroguide.fragment.HeroTabsFragment;

public class HeroDetailsActivity extends CollapsingToolbarActivity
{
    private Hero hero;

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

        hero = (Hero) getIntent().getExtras().getSerializable("hero");
        if (hero != null)
        {
            setAppBarImage(hero.getHeroPicture());
            setAppBarTitle(hero.getHeroName());
        }

        if (savedInstanceState == null){
            HeroTabsFragment fragment = new HeroTabsFragment();
            replaceFragment(fragment, R.id.container);
        }

    }
}
