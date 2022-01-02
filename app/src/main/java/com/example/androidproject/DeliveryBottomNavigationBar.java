package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import my.androidProject.app.chefFoodPanel.DeliveryOrdersFragment;
import my.androidProject.app.chefFoodPanel.DeliveryProfileFragment;
import my.androidProject.app.chefFoodPanel.DeliveryShippingFragment;

public class DeliveryBottomNavigationBar extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_bottom_navigation_bar);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.deli_profile:
                fragment=new DeliveryProfileFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.shipping:
                fragment=new DeliveryShippingFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.order:
                fragment=new DeliveryOrdersFragment();
                break;
        }
        return loaddeliveryfragment(fragment);
    }

    private boolean loaddeliveryfragment(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
    }
