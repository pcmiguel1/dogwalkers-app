package com.pcmiguel.dogwalkers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new HomeFragment()).commit();
        navigationView.setSelectedItemId(R.id.nav_home);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                fragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        item.setChecked(true);
                        fragment = new HomeFragment();
                        break;

                    case R.id.nav_favourites:
                        item.setChecked(true);
                        fragment = new FavouritesFragment();
                        break;

                    case R.id.nav_orderHistory:
                        item.setChecked(true);
                        fragment = new OrderHistoryFragment();
                        break;

                    case R.id.nav_profile:
                        item.setChecked(true);
                        fragment = new ProfileFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.body_container, fragment).commit();

                return false;
            }
        });

    }
}