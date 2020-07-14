package com.silentcodder.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.silentcodder.learningapp.Bird_Info.Peacock_Info_Activity;
import com.silentcodder.learningapp.Flower_Info.Daisy_Info;
import com.silentcodder.learningapp.Flower_Info.Jasmine_Info;
import com.silentcodder.learningapp.Flower_Info.Jaswand_Info;
import com.silentcodder.learningapp.Flower_Info.Lotus_Info;
import com.silentcodder.learningapp.Flower_Info.Rose_Info;
import com.silentcodder.learningapp.Flower_Info.Sadaphuli_Info;
import com.silentcodder.learningapp.Flower_Info.Sunflower_Info;
import com.silentcodder.learningapp.Flower_Info.Zendu_Info;

public class Flower extends AppCompatActivity {

    LinearLayout kamal,daisy,jaswand,mogara,rose,sadaphuli,sunflower,zendu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        kamal = (LinearLayout) findViewById(R.id.btn_readMore_lotus);
        daisy = (LinearLayout) findViewById(R.id.btn_readMore_daisy);
        jaswand = (LinearLayout) findViewById(R.id.btn_readMore_jaswand);
        mogara = (LinearLayout) findViewById(R.id.btn_readMore_mogara);
        rose = (LinearLayout) findViewById(R.id.btn_readMore_rose);
        sadaphuli = (LinearLayout) findViewById(R.id.btn_readMore_sadaphuli);
        sunflower = (LinearLayout) findViewById(R.id.btn_readMore_sunFlower);
        zendu = (LinearLayout) findViewById(R.id.btn_readMore_zendu);

        kamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Lotus_Info.class));
            }
        });
        daisy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Daisy_Info.class));
            }
        });
        jaswand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Jaswand_Info.class));
            }
        });
        mogara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Jasmine_Info.class));
            }
        });
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Rose_Info.class));
            }
        });
        sadaphuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Sadaphuli_Info.class));
            }
        });
        sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Sunflower_Info.class));
            }
        });
        zendu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flower.this, Zendu_Info.class));
            }
        });
    }
}