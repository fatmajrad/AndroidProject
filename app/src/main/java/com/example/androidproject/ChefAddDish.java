package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

public class ChefAddDish extends AppCompatActivity {
    ConstraintLayout bgimage;
    Button post_dish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_add_dish);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img1),2500);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img2),2500);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img3),2500);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img4),2500);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img5),2500);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img6),2500);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(500);
        animationDrawable.setExitFadeDuration(1600);
        bgimage = findViewById(R.id.back3);
        bgimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();
    }

}