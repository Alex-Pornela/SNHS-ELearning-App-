package com.activity.snhs.Grade8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade9.MainActivity3;
import com.activity.snhs.MainActivity;
import com.activity.snhs.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( MainActivity2.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}