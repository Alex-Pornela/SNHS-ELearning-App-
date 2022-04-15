package com.activity.snhs.Grade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade9.AP.ApActivity;
import com.activity.snhs.Grade9.AP.Quarter1;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity3.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}