package com.apps.headtrap.overwatchheroguide.fragment;


import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.adapter.MainTabAdapter;
import com.apps.headtrap.overwatchheroguide.utils.Constants;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainTabsFragment extends BaseFragment
{

    private static TabLayout tabLayout;
    private ViewPager viewPager;

    public MainTabsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_tabs, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(2);

        viewPager.setAdapter(new MainTabAdapter(getContext(), getChildFragmentManager()));

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);

        int color = ContextCompat.getColor(getContext(), R.color.white);
        int colorBackground = ContextCompat.getColor(getContext(), R.color.colorPrimary);
        int selectorColor = ContextCompat.getColor(getContext(), R.color.colorPrimaryDark);

        tabLayout.setTabTextColors(color, color);
        tabLayout.setBackgroundColor(colorBackground);
        tabLayout.setSelectedTabIndicatorColor(selectorColor);
        tabLayout.setSelectedTabIndicatorHeight(8);
        changeTabsFont();
        return view;
    }

    private void changeTabsFont()
    {

        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++)
        {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++)
            {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView)
                {
                    AssetManager am = getContext().getApplicationContext().getAssets();
                    Typeface tf = Typeface.createFromAsset(am, String.format(Locale.US, Constants.FONT_MENU));
                    ((TextView) tabViewChild).setTypeface(tf);
                }
            }
        }
    }

}
