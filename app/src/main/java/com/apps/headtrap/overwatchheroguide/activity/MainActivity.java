
package com.apps.headtrap.overwatchheroguide.activity;


import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.fragment.MainTabsFragment;
import com.squareup.picasso.Picasso;


public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener
{

    private CoordinatorLayout rootView;
    private TextView tvName;
    private ImageView imProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootView = (CoordinatorLayout) findViewById(R.id.rootView);

        setupToolbar();
        setupNavDrawer(this);

        if (savedInstanceState == null)
        {
            MainTabsFragment frag = new MainTabsFragment();
            replaceFragment(frag, R.id.container);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.nav_logout)
        {
        }
        else if (id == R.id.opt1)
        {
        }
        else if (id == R.id.opt2)
        {
        }
        else if (id == R.id.opt3)
        {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        this.moveTaskToBack(true);
    }


    public void setupNavDrawer(NavigationView.OnNavigationItemSelectedListener listener)
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null)
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(listener);
            navigationView.setCheckedItem(R.id.nav_logout);

            View headerLayout = navigationView.getHeaderView(0);

            tvName = (TextView) headerLayout.findViewById(R.id.tNome);
            imProfile = (ImageView) headerLayout.findViewById(R.id.imgUser);

            Picasso.with(this)
                    .load(R.drawable.ic_overwatch_logo)
                    .into(imProfile);

        }
    }

}
