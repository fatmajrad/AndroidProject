package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button chef, customer,deliveryPerson;
    Intent intent;
    String type;
    ConstraintLayout bgimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img1),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img4),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img5),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img6),3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);

        bgimage = findViewById(R.id.back3);
        bgimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        intent=getIntent();
        type=intent.getStringExtra("Home").toString().trim();

        chef=(Button)findViewById(R.id.chef);
        deliveryPerson =(Button) findViewById(R.id.delivery);
        customer=(Button) findViewById(R.id.customer);

        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("Email")) {

                    Intent loginemailChef = new Intent(ChooseOne.this, ChefLogin.class);
                    startActivity(loginemailChef);
                    finish();
                }
                if (type.equals("SignUp")) {
                    Intent RegisterChef = new Intent(ChooseOne.this, ChefRegistartion.class);
                    startActivity(RegisterChef);
                }
            }
        });
                 customer.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      if (type.equals("Email")) {

                          Intent loginemailCust = new Intent(ChooseOne.this, CustomLogin.class);
                          startActivity(loginemailCust);
                          finish();
                      }
                      if (type.equals("SignUp")) {
                          Intent RegisterCust = new Intent(ChooseOne.this, CustomRegistartion.class);
                          startActivity(RegisterCust);
                      }
                  }
              });

        deliveryPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("Email")) {

                    Intent loginemailDeli = new Intent(ChooseOne.this, DeliveryLogin.class);
                    startActivity(loginemailDeli);
                    finish();
                }
                if (type.equals("SignUp")) {
                    Intent RegisterDeli = new Intent(ChooseOne.this, DeliveryRegistartion.class);
                    startActivity(RegisterDeli);
                }
            }
        });

    }
}