package com.example.study99;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;


public class Dashboard extends AppCompatActivity {

    private DrawerLayout drawerr;
    NavigationView navigation1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
        this.setTitle(" Dashboard");



       drawerr=findViewById(R.id.drawer_l);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                this,drawerr,R.string.navigation_open,R.string.navigation_close


        );
        navigation1 = (NavigationView) findViewById(R.id.navigation_view);
        navigation1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.latest:
                        Intent intent=new Intent(Dashboard.this,Latest.class);
                        startActivity(intent);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.topics:
                        Intent intent1=new Intent(Dashboard.this,Topics.class);
                        startActivity(intent1);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.search:
                        Intent intent2=new Intent(Dashboard.this,Search.class);
                        startActivity(intent2);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.bookmark:
                        Intent intent3=new Intent(Dashboard.this,Bookmark.class);
                        startActivity(intent3);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.recommend:
                        Intent intent4=new Intent(Dashboard.this,Recommendation.class);
                        startActivity(intent4);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.log:
                        Intent intent5=new Intent(Dashboard.this,MainActivity.class);
                        startActivity(intent5);
                        //for stopping backpressed
                        finish();
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.settings:
                        Intent intent6=new Intent(Dashboard.this,Settings.class);
                        startActivity(intent6);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.Share:
                        Intent intent7=new Intent(Dashboard.this,Share.class);
                        startActivity(intent7);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                    case R.id.about:
                        Intent intent8=new Intent(Dashboard.this,AboutApp.class);
                        startActivity(intent8);
                        //Do some thing here
                        // add navigation drawer item onclick method here
                        break;
                }
                return false;
            }
        });



    }

    @Override
    public void onBackPressed() {

        if(drawerr.isDrawerOpen(GravityCompat.START)){
            drawerr.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }


    }






}
