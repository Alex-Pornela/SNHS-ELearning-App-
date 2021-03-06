package com.activity.snhs.Grade8.TLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade8.Math.MathActivity;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter140 );


        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade8/tle/tle4_drafting.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter4.this, TleActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}