package com.activity.snhs.Grade10.TLE.Cookery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.activity.snhs.Grade10.MainActivity4;
import com.activity.snhs.Grade10.TLE.Drafting.DraftingActivity;
import com.activity.snhs.R;

public class CookeryActivity extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn,next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cookery2 );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );
        next_btn = findViewById( R.id.next_btn );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        } );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, Quarter1.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, Quarter2.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, Quarter3.class);
                startActivity(intent);
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, Quarter4.class);
                startActivity(intent);
            }
        } );

        next_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( CookeryActivity.this, DraftingActivity.class);
                startActivity(intent);
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( CookeryActivity.this, MainActivity4.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}