package com.activity.snhs.Grade9.Math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter35 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/math/math3.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter3.this, MathActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}