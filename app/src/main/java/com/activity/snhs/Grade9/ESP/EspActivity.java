package com.activity.snhs.Grade9.ESP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Grade9.MainActivity3;
import com.activity.snhs.R;

public class EspActivity extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_esp );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( EspActivity.this, MainActivity3.class);
                startActivity(intent);
                finish();
            }
        } );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( EspActivity.this, Quarter1.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( EspActivity.this, Quarter2.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( EspActivity.this, Quarter3.class);
                startActivity(intent);
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( EspActivity.this, Quarter4.class);
                startActivity(intent);
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( EspActivity.this, MainActivity3.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}