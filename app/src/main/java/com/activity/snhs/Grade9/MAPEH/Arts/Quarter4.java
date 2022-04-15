package com.activity.snhs.Grade9.MAPEH.Arts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter56 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/mapeh/arts/arts4.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter4.this, ArtsActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}