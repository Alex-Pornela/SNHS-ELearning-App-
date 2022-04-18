package com.activity.snhs.Grade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Grade9.AP.ApActivity;
import com.activity.snhs.Grade9.AP.Quarter1;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity3 extends AppCompatActivity {

    ImageView back_arrow, ap_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        back_arrow = findViewById(R.id.back_arrow);
        ap_arrow = findViewById(R.id.ap_arrow);

        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ap_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity3.this, ApActivity.class);
                startActivity(intent);
            }
        } );
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity3.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}