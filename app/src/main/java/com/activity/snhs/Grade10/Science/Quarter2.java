package com.activity.snhs.Grade10.Science;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter178 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade10/science/science1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter2.this, ScienceActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}