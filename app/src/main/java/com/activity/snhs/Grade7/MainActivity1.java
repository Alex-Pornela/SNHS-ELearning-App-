package com.activity.snhs.Grade7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Grade7.AP.ApActivity;
import com.activity.snhs.Grade7.ESP.EspActivity;
import com.activity.snhs.Grade7.English.EnglishActivity;
import com.activity.snhs.Grade7.Filipino.FilipinoActivity;
import com.activity.snhs.Grade7.MAPEH.Arts.ArtsActivity;
import com.activity.snhs.Grade7.MAPEH.Health.HealthActivity;
import com.activity.snhs.Grade7.MAPEH.Music.MusicActivity;
import com.activity.snhs.Grade7.MAPEH.PE.PEActivity;
import com.activity.snhs.Grade7.Math.MathActivity;
import com.activity.snhs.Grade7.Science.ScienceActivity;
import com.activity.snhs.Grade7.TLE.TleActivity;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity1 extends AppCompatActivity {

    ImageView back_arrow, ap_arrow, eng, fil, math, science, music, arts, esp, health, pe, tle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main1 );

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
        tle = findViewById(R.id.tle_arrow);


        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ap_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, ApActivity.class);
                startActivity(intent);
            }
        } );

        eng.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, EnglishActivity.class);
                startActivity(intent);
            }
        } );

        science.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, ScienceActivity.class);
                startActivity(intent);
            }
        } );

        fil.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, FilipinoActivity.class);
                startActivity(intent);
            }
        } );

        math.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, MathActivity.class);
                startActivity(intent);
            }
        } );

        esp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, EspActivity.class);
                startActivity(intent);
            }
        } );

        music.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, MusicActivity.class);
                startActivity(intent);
            }
        } );

        arts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, ArtsActivity.class);
                startActivity(intent);
            }
        } );

        health.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, HealthActivity.class);
                startActivity(intent);
            }
        } );

        pe.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, PEActivity.class);
                startActivity(intent);
            }
        } );

        tle.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity1.this, TleActivity.class);
                startActivity(intent);
            }
        } );

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity1.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}