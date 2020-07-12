package com.silentcodder.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Animal extends AppCompatActivity {

    LinearLayout tiger,lion,bear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        tiger = (LinearLayout) findViewById(R.id.btn_readMore_tiger);
        lion = (LinearLayout) findViewById(R.id.btn_readMore_lion);
        bear = (LinearLayout) findViewById(R.id.btn_readMore_bear);

        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Tiger_Info.class));
            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Lion_Info.class));
            }
        });
        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Bear_Info.class));
            }
        });
    }
}