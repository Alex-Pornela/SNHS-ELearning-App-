package com.activity.snhs.Whlp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp8.FirstWhlp8;
import com.activity.snhs.Whlp.whlp8.SecondWhlp8;
import com.activity.snhs.Whlp.whlp9.FirstWhlp9;
import com.activity.snhs.Whlp.whlp9.SecondWhlp9;

public class grade9 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_grade9 );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade9.this, Whlp.class);
                startActivity(intent);
                finish();
            }
        } );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade9.this, FirstWhlp9.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade9.this, SecondWhlp9.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade9.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade9.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( grade9.this, Whlp.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}