package com.activity.snhs.Whlp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.activity.snhs.Grade7.AP.ApActivity;
import com.activity.snhs.Grade7.AP.Quarter1;
import com.activity.snhs.Grade7.AP.Quarter2;
import com.activity.snhs.Grade7.AP.Quarter3;
import com.activity.snhs.Grade7.AP.Quarter4;
import com.activity.snhs.Grade7.MainActivity1;
import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp7.FirstWhlp7;
import com.activity.snhs.Whlp.whlp7.SecondWhlp7;

public class grade7 extends AppCompatActivity {

    ImageView back_arrow, first_btn, second_btn, third_btn, fourth_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_grade7 );

        back_arrow = findViewById( R.id.back_arrow );
        first_btn = findViewById( R.id.first_btn );
        second_btn = findViewById( R.id.second_btn );
        third_btn = findViewById( R.id.third_btn );
        fourth_btn = findViewById( R.id.fourth_btn );


        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade7.this, Whlp.class);
                startActivity(intent);
                finish();
            }
        } );

        first_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade7.this, FirstWhlp7.class);
                startActivity(intent);
            }
        } );

        second_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( grade7.this, SecondWhlp7.class);
                startActivity(intent);
            }
        } );

        third_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade7.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );

        fourth_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( grade7.this, "Not available as of now", Toast.LENGTH_SHORT ).show();
            }
        } );


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( grade7.this, Whlp.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }

}