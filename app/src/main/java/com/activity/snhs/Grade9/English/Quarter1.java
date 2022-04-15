package com.activity.snhs.Grade9.English;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade9.AP.ApActivity;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter25 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/english/english1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter1.this, EnglishActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}