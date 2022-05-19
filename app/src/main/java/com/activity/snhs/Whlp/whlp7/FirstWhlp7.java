package com.activity.snhs.Whlp.whlp7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.grade7;
import com.activity.snhs.Whlp.grade9;
import com.activity.snhs.Whlp.whlp7.Quarter.First;
import com.activity.snhs.Whlp.whlp9.FirstWhlp9;
import com.activity.snhs.Whlp.whlp9.first.Week1;

public class FirstWhlp7 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn,fifth_btn,sixth_btn,seventh_btn,eight_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_first_whlp7 );

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

                Intent intent = new Intent( FirstWhlp7.this, First.class);
                String message = "week1";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week2";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week3";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week4";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        fifth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week5";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        sixth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week6";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        seventh_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week7";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        eight_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstWhlp7.this, First.class);
                String message = "week8";
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        } );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( FirstWhlp7.this, grade7.class);
                startActivity(intent);
                finish();
            }
        } );

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( FirstWhlp7.this, grade7.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}