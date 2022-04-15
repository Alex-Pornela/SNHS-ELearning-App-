package com.activity.snhs.Grade9.English;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter26 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/english/english2.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter2.this, EnglishActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}