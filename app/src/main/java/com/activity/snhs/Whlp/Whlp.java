package com.activity.snhs.Whlp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class Whlp extends AppCompatActivity {

    ImageView seven_btn, eight_btn, nine_btn, ten_btn,back_arrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_whlp );


        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        ten_btn = findViewById(R.id.ten_btn);
        back_arrow = findViewById(R.id.back_arrow);


        seven_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Whlp.this, grade7.class );
                startActivity( intent );
                finish();
            }
        } );

        eight_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Whlp.this, grade8.class );
                startActivity( intent );
                finish();
            }
        } );

        nine_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Whlp.this, grade9.class );
                startActivity( intent );
                finish();
            }
        } );

        ten_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Whlp.this, grade10.class );
                startActivity( intent );
                finish();
            }
        } );

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Whlp.this, MainActivity.class );
                startActivity( intent );
                finish();
            }
        } );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Whlp.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}