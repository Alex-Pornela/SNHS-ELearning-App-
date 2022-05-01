package com.activity.snhs.Grade10.TLE.CSS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter187 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade10/tle/css/css3.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter3.this, CssActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}