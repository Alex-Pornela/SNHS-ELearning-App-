package com.activity.snhs.Grade10.Esp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter149 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade10/esp/esp1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter1.this, EspActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}