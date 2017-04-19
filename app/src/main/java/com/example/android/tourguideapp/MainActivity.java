package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.city_hotels);

        displaySelectedScreen(R.id.city_hotels);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        item.setChecked(true);
        setTitle(item.getTitle());

        displaySelectedScreen(id);

        return true;
    }

    private void displaySelectedScreen(int id) {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //creating fragment object
        Fragment fragment = null;
        // int itemId = item.getItemId();
        //initializing the fragment object which is selected
        switch (id) {
            case R.id.city_hotels:
                toolbar.setTitle(R.string.best_hotels);
                fragment = new HotelsFragment();
                break;
            case R.id.city_restaurants:
                toolbar.setTitle(R.string.best_res);
                fragment = new RestaurantsFragment();
                break;
            case R.id.city_Bars:
                toolbar.setTitle(R.string.best_bars);
                fragment = new BarsFragment();
                break;
            case R.id.city_shopping:
                toolbar.setTitle(R.string.best_malls);
                fragment = new ShoppingMallsFragment();
                break;
            case R.id.city_parks:
                toolbar.setTitle(R.string.best_life);
                fragment = new ActiveLifeFragment();
                break;
            default:
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}
