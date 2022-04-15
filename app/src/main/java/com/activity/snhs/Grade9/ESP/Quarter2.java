package com.activity.snhs.Grade9.ESP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter70 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/esp/esp2.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter2.this, EspActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}