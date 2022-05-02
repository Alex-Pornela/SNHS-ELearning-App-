package com.activity.snhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Teachers.ApTeachers;
import com.activity.snhs.Teachers.EnglishTeachers;
import com.activity.snhs.Teachers.EspTeachers;
import com.activity.snhs.Teachers.FilipinoTeachers;
import com.activity.snhs.Teachers.MapehTeachers;
import com.activity.snhs.Teachers.MathTeachers;
import com.activity.snhs.Teachers.ScienceTeachers;
import com.activity.snhs.Teachers.TleTeachers;


public class TeacherActivity extends AppCompatActivity {

    ImageView back_arrow, ap_arrow, eng, fil, math, science,  esp, pe, cookery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_teacher );

        back_arrow = findViewById(R.id.back_arrow);
        ap_arrow = findViewById(R.id.ap_arrow);
        eng = findViewById(R.id.eng_arrow);
        science = findViewById(R.id.sci_arrow);
        fil = findViewById(R.id.fil_arrow);
        math = findViewById(R.id.math_arrow);
        esp = findViewById(R.id.esp_arrow);
        pe = findViewById(R.id.pe_arrow);
        cookery = findViewById(R.id.cook_arrow);

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ap_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, ApTeachers.class);
                startActivity(intent);
            }
        } );

        eng.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, EnglishTeachers.class);
                startActivity(intent);
            }
        } );

        science.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, ScienceTeachers.class);
                startActivity(intent);
            }
        } );

        fil.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, FilipinoTeachers.class);
                startActivity(intent);
            }
        } );

        math.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, MathTeachers.class);
                startActivity(intent);
            }
        } );

        esp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, EspTeachers.class);
                startActivity(intent);
            }
        } );

        pe.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, MapehTeachers.class);
                startActivity(intent);
            }
        } );

        cookery.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TeacherActivity.this, TleTeachers.class);
                startActivity(intent);
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( TeacherActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}