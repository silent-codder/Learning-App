package com.silentcodder.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.silentcodder.learningapp.Animal_Info.Bear_Info;
import com.silentcodder.learningapp.Animal_Info.Camel_Info;
import com.silentcodder.learningapp.Animal_Info.Cow_Info;
import com.silentcodder.learningapp.Animal_Info.Deer_Info;
import com.silentcodder.learningapp.Animal_Info.Elephant_Info;
import com.silentcodder.learningapp.Animal_Info.Horse_Info;
import com.silentcodder.learningapp.Animal_Info.Lion_Info;
import com.silentcodder.learningapp.Animal_Info.Rabbit_Info;
import com.silentcodder.learningapp.Animal_Info.Tiger_Info;
import com.silentcodder.learningapp.Animal_Info.Zebra_Info;

public class Animal extends AppCompatActivity {

    LinearLayout tiger,lion,bear,camel,cow,deer,elephant,horse,zebra,rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        tiger = (LinearLayout) findViewById(R.id.btn_readMore_tiger);
        lion = (LinearLayout) findViewById(R.id.btn_readMore_lion);
        bear = (LinearLayout) findViewById(R.id.btn_readMore_bear);
        camel = (LinearLayout) findViewById(R.id.btn_readMore_camel);
        cow = (LinearLayout) findViewById(R.id.btn_readMore_cow);
        deer = (LinearLayout) findViewById(R.id.btn_readMore_deer);
        elephant = (LinearLayout) findViewById(R.id.btn_readMore_elephant);
        horse = (LinearLayout) findViewById(R.id.btn_readMore_horse);
        zebra = (LinearLayout) findViewById(R.id.btn_readMore_zebra);
        rabbit = (LinearLayout) findViewById(R.id.btn_readMore_rabbit);

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
        camel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Camel_Info.class));
            }
        });
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Cow_Info.class));
            }
        });
        deer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Deer_Info.class));
            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Elephant_Info.class));
            }
        });
        horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Horse_Info.class));
            }
        });
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Zebra_Info.class));
            }
        });
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Rabbit_Info.class));
            }
        });
    }
}