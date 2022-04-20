package com.activity.snhs.Grade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Grade9.AP.ApActivity;
import com.activity.snhs.Grade9.AP.Quarter1;
import com.activity.snhs.Grade9.ESP.EspActivity;
import com.activity.snhs.Grade9.English.EnglishActivity;
import com.activity.snhs.Grade9.Filipino.FilActivity;
import com.activity.snhs.Grade9.MAPEH.Arts.ArtsActivity;
import com.activity.snhs.Grade9.MAPEH.Health.HealthActivity;
import com.activity.snhs.Grade9.MAPEH.Music.MusicActivity;
import com.activity.snhs.Grade9.MAPEH.PE.PEActivity;
import com.activity.snhs.Grade9.Math.MathActivity;
import com.activity.snhs.Grade9.Science.ScienceActivity;
import com.activity.snhs.Grade9.TLE.CSS.CssActivity;
import com.activity.snhs.Grade9.TLE.Cookery.CookeryActivity;
import com.activity.snhs.Grade9.TLE.Drafting.DraftingActivity;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity3 extends AppCompatActivity {

    ImageView back_arrow, ap_arrow, eng, fil, math, science, music, arts, esp, health, pe, drafting, css, cookery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

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
                Intent intent = new Intent( MainActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ap_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, ApActivity.class);
                startActivity(intent);
            }
        } );

        eng.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, EnglishActivity.class);
                startActivity(intent);
            }
        } );

        science.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, ScienceActivity.class);
                startActivity(intent);
            }
        } );

        fil.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, FilActivity.class);
                startActivity(intent);
            }
        } );

        math.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, MathActivity.class);
                startActivity(intent);
            }
        } );

        esp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, EspActivity.class);
                startActivity(intent);
            }
        } );

        music.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, MusicActivity.class);
                startActivity(intent);
            }
        } );

        arts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, ArtsActivity.class);
                startActivity(intent);
            }
        } );

        health.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, HealthActivity.class);
                startActivity(intent);
            }
        } );

        pe.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, PEActivity.class);
                startActivity(intent);
            }
        } );

        drafting.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, DraftingActivity.class);
                startActivity(intent);
            }
        } );

        css.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, CssActivity.class);
                startActivity(intent);
            }
        } );

        cookery.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, CookeryActivity.class);
                startActivity(intent);
            }
        } );

    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity3.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}