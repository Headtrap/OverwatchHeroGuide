package com.apps.headtrap.overwatchheroguide.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.fragment.AbilitiesFragment;
import com.apps.headtrap.overwatchheroguide.fragment.HowToFragment;
import com.apps.headtrap.overwatchheroguide.utils.Constants;

/**
 * Created by Gustavo on 11/29/2016.
 */

public class HeroTabAdapter extends FragmentPagerAdapter {
    Context context;

    public HeroTabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Bundle args = new Bundle();
        if (position == 0) {
            args.putString("type", Constants.TITLE_ABILITIES);
            fragment = new AbilitiesFragment();
        } else if (position == 1) {
            args.putString("type", Constants.TITLE_HOW_TO);
            fragment = new HowToFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return (context.getString(R.string.title_abilities) + " ");
        }

        return (context.getString(R.string.title_how_to) + " ");
    }

}
