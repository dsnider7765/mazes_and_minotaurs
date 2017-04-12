package com.example.cis.mazeminotaurs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
//<<<<<<< 
//=======
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
//>>>>>>> /master
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
//<<<<<<< 
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
//=======
//>>>>>>> /master

import com.example.cis.mazeminotaurs.web_resources.CompanionFragment;
import com.example.cis.mazeminotaurs.web_resources.PlayerManualFragment;
import com.example.cis.mazeminotaurs.web_resources.WebsiteFragment;

public class MainMazes extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

/*<<<<<<< 
    Button mNewChara;
    Button mCharaCont;
    Button mPlayerManual;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mazes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
=======*/
    public Portfolio mPortfolio;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//>>>>>>> /master

            mPortfolio = Portfolio.get();

            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            Fragment contentFragment = new SplashScreenFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, contentFragment);
            ft.commit();
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

/*<<<<<<< 
        mCharaCont = (Button) findViewById(R.id.character_continue_bttn);
        mCharaCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.list_item_character);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(findViewById(android.R.id.content).getId(),new LoadCharacterFragment());
                ft.commit();
            }
        });
        mPlayerManual = (Button) findViewById(R.id.player_manual_bttn);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_mazes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Fragment contentFrag = null;
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
=======*/
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
//>>>>>>> /master
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();
            Fragment contentFragment = new SplashScreenFragment();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, contentFragment);
            ft.commit();

            if (id == R.id.create_character) {
                // Handle the camera action
            } else if (id == R.id.play_character) {
                contentFragment = new CharacterSheetFragment();

            } else if (id == R.id.delete_character) {

            } else if (id == R.id.player_manual) {
                contentFragment = new PlayerManualFragment();
            } else if (id == R.id.player_comapanion) {
                contentFragment = new CompanionFragment();
            } else if (id == R.id.website) {
                contentFragment = new WebsiteFragment();
            }

            if (contentFragment != null){
                ft.replace(R.id.content_frame, contentFragment);
            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

}

