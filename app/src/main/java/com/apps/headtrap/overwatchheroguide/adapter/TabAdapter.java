package com.apps.headtrap.overwatchheroguide.adapter;

import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.fragment.HeroesFragment;
import com.apps.headtrap.overwatchheroguide.fragment.MapsFragment;
import com.apps.headtrap.overwatchheroguide.fragment.StrategyFragment;
import com.apps.headtrap.overwatchheroguide.utils.Constants;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class TabAdapter extends FragmentPagerAdapter
{
    Context context;

    public TabAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment frag = null;
        Bundle args = new Bundle();
        if (position == 0)
        {
            args.putString("tipo", Constants.TITLE_HEROES);
            frag = new HeroesFragment();
        }
        else if (position == 1)
        {
            args.putString("tipo", Constants.TITLE_MAPS);
            frag = new MapsFragment();
        }
        else if (position == 2)
        {
            args.putString("tipo", Constants.TITLE_STRATEGY);
            frag = new StrategyFragment();

        }
        return frag;
    }


    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return (context.getString(R.string.title_heroes)+" ");
        }
        else if (position == 1)
        {
            return (context.getString(R.string.title_maps)+" ");
        }
        return (context.getString(R.string.title_strategy)+ " ");
    }

}