package com.activity.snhs.Whlp.whlp8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.grade8;
import com.github.barteksc.pdfviewer.PDFView;

public class WhlpQuarter3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_whlp_quarter3 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("whlp/grade8/q3.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( WhlpQuarter3.this, grade8.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}