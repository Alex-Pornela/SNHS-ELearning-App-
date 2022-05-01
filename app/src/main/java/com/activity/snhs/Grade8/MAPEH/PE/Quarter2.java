package com.activity.snhs.Grade8.MAPEH.PE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade8.MAPEH.Health.HealthActivity;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter126 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade8/mapeh/pe/pe2.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter2.this, HealthActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}