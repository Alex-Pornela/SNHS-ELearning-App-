package com.activity.snhs.Whlp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp10.FirstWhlp10;
import com.activity.snhs.Whlp.whlp10.SecondWhlp10;
import com.activity.snhs.Whlp.whlp9.FirstWhlp9;
import com.activity.snhs.Whlp.whlp9.SecondWhlp9;

public class grade10 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_grade10 );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade10.this, FirstWhlp10.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade10.this, SecondWhlp10.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade10.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade10.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( grade10.this, Whlp.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}