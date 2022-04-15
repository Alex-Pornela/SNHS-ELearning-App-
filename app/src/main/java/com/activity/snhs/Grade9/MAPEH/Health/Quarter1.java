package com.activity.snhs.Grade9.MAPEH.Health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade9.MAPEH.Arts.ArtsActivity;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter57 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/mapeh/health/health1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter1.this, HealthActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}