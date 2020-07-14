package com.silentcodder.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.silentcodder.learningapp.Animal_Info.Tiger_Info;
import com.silentcodder.learningapp.Bird_Info.Cock_Info;
import com.silentcodder.learningapp.Bird_Info.Crow_Info;
import com.silentcodder.learningapp.Bird_Info.Duck_Info;
import com.silentcodder.learningapp.Bird_Info.Egale_Info_Activity;
import com.silentcodder.learningapp.Bird_Info.Parrot_Info_Activity;
import com.silentcodder.learningapp.Bird_Info.Peacock_Info_Activity;
import com.silentcodder.learningapp.Bird_Info.Piageon_Info;
import com.silentcodder.learningapp.Bird_Info.Sparrow_Info;

public class Bird extends AppCompatActivity {

    LinearLayout peacock,eagle,parrot,sparrow,cock,duck,crow,pigeon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        peacock = (LinearLayout) findViewById(R.id.btn_readMore_peacock);
        eagle = (LinearLayout) findViewById(R.id.btn_readMore_eagle);
        parrot = (LinearLayout) findViewById(R.id.btn_readMore_parrot);
        sparrow = (LinearLayout) findViewById(R.id.btn_readMore_sparrow);
        cock = (LinearLayout) findViewById(R.id.btn_readMore_cock);
        duck = (LinearLayout) findViewById(R.id.btn_readMore_duck);
        crow = (LinearLayout) findViewById(R.id.btn_readMore_crow);
        pigeon = (LinearLayout) findViewById(R.id.btn_readMore_pigeon);

        peacock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Peacock_Info_Activity.class));
            }
        });
        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Egale_Info_Activity.class));
            }
        });
        parrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Parrot_Info_Activity.class));
            }
        });
        sparrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Sparrow_Info.class));
            }
        });
        cock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Cock_Info.class));
            }
        });
        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Duck_Info.class));
            }
        });
        crow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Crow_Info.class));
            }
        });
        pigeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bird.this, Piageon_Info.class));
            }
        });

    }
}