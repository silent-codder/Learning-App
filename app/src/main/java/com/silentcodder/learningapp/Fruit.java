package com.silentcodder.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.silentcodder.learningapp.Flower_Info.Lotus_Info;
import com.silentcodder.learningapp.Fruit_Info.Apple_Info;
import com.silentcodder.learningapp.Fruit_Info.Banana_Info;
import com.silentcodder.learningapp.Fruit_Info.Grapes_Info;
import com.silentcodder.learningapp.Fruit_Info.JackFruit_Info;
import com.silentcodder.learningapp.Fruit_Info.Mango_Info;
import com.silentcodder.learningapp.Fruit_Info.Orange_Info;
import com.silentcodder.learningapp.Fruit_Info.Pinaple_Info;
import com.silentcodder.learningapp.Fruit_Info.Straberry_Info;

public class Fruit extends AppCompatActivity {

    LinearLayout apple,banana,grapes,jackfruit,mango,orange,pinaple,strawberry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        apple = (LinearLayout) findViewById(R.id.btn_readMore_apple);
        banana = (LinearLayout) findViewById(R.id.btn_readMore_banana);
        grapes = (LinearLayout) findViewById(R.id.btn_readMore_grapes);
        jackfruit = (LinearLayout) findViewById(R.id.btn_readMore_jackFruit);
        mango = (LinearLayout) findViewById(R.id.btn_readMore_mango);
        orange = (LinearLayout) findViewById(R.id.btn_readMore_orange);
        pinaple = (LinearLayout) findViewById(R.id.btn_readMore_pinaple);
        strawberry = (LinearLayout) findViewById(R.id.btn_readMore_strawberry);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Apple_Info.class));
            }
        });
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Banana_Info.class));
            }
        });
        grapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Grapes_Info.class));
            }
        });
        jackfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, JackFruit_Info.class));
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Mango_Info.class));
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Orange_Info.class));
            }
        });
        pinaple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Pinaple_Info.class));
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruit.this, Straberry_Info.class));
            }
        });

    }
}