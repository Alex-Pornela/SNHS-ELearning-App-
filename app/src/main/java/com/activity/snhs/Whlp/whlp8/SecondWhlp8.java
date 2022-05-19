package com.activity.snhs.Whlp.whlp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.grade8;
import com.activity.snhs.Whlp.whlp8.Quarter.Second;


public class SecondWhlp8 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn,fifth_btn,sixth_btn,seventh_btn,eight_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second_whlp8 );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );
        fifth_btn = findViewById( R.id.fifth_btn );
        sixth_btn = findViewById( R.id.sixth_btn );
        seventh_btn = findViewById( R.id.seventh_btn );
        eight_btn = findViewById( R.id.eight_btn );


        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( SecondWhlp8.this, Second.class);
                String message = "week1";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week2";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week3";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week4";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        fifth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week5";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        sixth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week6";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        seventh_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week7";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        eight_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondWhlp8.this, Second.class);
                String message = "week8";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SecondWhlp8.this, grade8.class);
                startActivity(intent);
                finish();
            }
        } );

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( SecondWhlp8.this, grade8.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}