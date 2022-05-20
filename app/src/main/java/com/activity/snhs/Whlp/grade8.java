package com.activity.snhs.Whlp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp7.FirstWhlp7;
import com.activity.snhs.Whlp.whlp7.SecondWhlp7;
import com.activity.snhs.Whlp.whlp8.FirstWhlp8;
import com.activity.snhs.Whlp.whlp8.SecondWhlp8;
import com.activity.snhs.Whlp.whlp8.WhlpQuarter1;
import com.activity.snhs.Whlp.whlp8.WhlpQuarter2;
import com.activity.snhs.Whlp.whlp8.WhlpQuarter3;
import com.activity.snhs.Whlp.whlp8.WhlpQuarter4;

public class grade8 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_grade8 );


        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );


        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade8.this, Whlp.class);
                startActivity(intent);
                finish();
            }
        } );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade8.this, WhlpQuarter1.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade8.this, WhlpQuarter2.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade8.this, WhlpQuarter3.class);
                startActivity(intent);
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade8.this, WhlpQuarter4.class);
                startActivity(intent);
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( grade8.this, Whlp.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }

}