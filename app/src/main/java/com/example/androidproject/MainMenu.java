package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {
      Button  signIn , signUp;
      ImageView bgImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final Animation zoomin = AnimationUtils.loadAnimation(this
        ,R.anim.zoomin);
        final Animation zoomout = AnimationUtils.loadAnimation(this
                ,R.anim.zoomout);

        bgImage=findViewById(R.id.imageView);
        bgImage.setAnimation(zoomin);
        bgImage.setAnimation(zoomout);

        zoomout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgImage.startAnimation(zoomin);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        zoomin.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                  bgImage.startAnimation(zoomout);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        signIn =(Button)findViewById(R.id.signIn);
        signUp =(Button)findViewById(R.id.signUp);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = new Intent(MainMenu.this,ChooseOne.class);
                signInIntent.putExtra("Home","Email");
                startActivity(signInIntent);
                finish();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpIntent = new Intent(MainMenu.this,ChooseOne.class);
                signUpIntent.putExtra("Home","SignUp");
                startActivity(signUpIntent);
                finish();
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}