package com.activity.snhs.Grade7.MAPEH.Arts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter77 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade7/mapeh/arts/arts1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter1.this, ArtsActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}