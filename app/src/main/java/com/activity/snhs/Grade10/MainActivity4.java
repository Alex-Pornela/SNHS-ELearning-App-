package com.activity.snhs.Grade10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.activity.snhs.Grade10.AP.ApActivity;
import com.activity.snhs.Grade10.English.EnglishActivity;
import com.activity.snhs.Grade10.Esp.EspActivity;
import com.activity.snhs.Grade10.Filipino.FilipinoActivity;
import com.activity.snhs.Grade10.MAPEH.Arts.ArtsActivity;
import com.activity.snhs.Grade10.MAPEH.Health.HealthActivity;
import com.activity.snhs.Grade10.MAPEH.Music.MusicActivity;
import com.activity.snhs.Grade10.MAPEH.PE.PEActivity;
import com.activity.snhs.Grade10.Math.MathActivity;
import com.activity.snhs.Grade10.Science.ScienceActivity;
import com.activity.snhs.Grade10.TLE.CSS.CssActivity;
import com.activity.snhs.Grade10.TLE.Cookery.CookeryActivity;
import com.activity.snhs.Grade10.TLE.Drafting.DraftingActivity;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity4 extends AppCompatActivity {

    ImageView back_arrow, ap_arrow, eng, fil, math, science, music, arts, esp, health, pe, drafting, css, cookery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main4 );


        back_arrow = findViewById(R.id.back_arrow);
        ap_arrow = findViewById(R.id.ap_arrow);
        eng = findViewById(R.id.eng_arrow);
        science = findViewById(R.id.sci_arrow);
        fil = findViewById(R.id.fil_arrow);
        math = findViewById(R.id.math_arrow);
        esp = findViewById(R.id.esp_arrow);
        music = findViewById(R.id.music_arrow);
        arts = findViewById(R.id.art_arrow);
        health = findViewById(R.id.health_arrow);
        pe = findViewById(R.id.pe_arrow);
        drafting = findViewById(R.id.drafting_arrow);
        css = findViewById(R.id.css_arrow);
        cookery = findViewById(R.id.cook_arrow);


        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ap_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, ApActivity.class);
                startActivity(intent);
            }
        } );

        eng.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, EnglishActivity.class);
                startActivity(intent);
            }
        } );

        science.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, ScienceActivity.class);
                startActivity(intent);
            }
        } );

        fil.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, FilipinoActivity.class);
                startActivity(intent);
            }
        } );

        math.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, MathActivity.class);
                startActivity(intent);
            }
        } );

        esp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, EspActivity.class);
                startActivity(intent);
            }
        } );

        music.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, MusicActivity.class);
                startActivity(intent);
            }
        } );

        arts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, ArtsActivity.class);
                startActivity(intent);
            }
        } );

        health.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, HealthActivity.class);
                startActivity(intent);
            }
        } );

        pe.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, PEActivity.class);
                startActivity(intent);
            }
        } );

       drafting.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, DraftingActivity.class);
                startActivity(intent);
            }
        } );

        css.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, CssActivity.class);
                startActivity(intent);
            }
        } );

        cookery.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity4.this, CookeryActivity.class);
                startActivity(intent);
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity4.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}