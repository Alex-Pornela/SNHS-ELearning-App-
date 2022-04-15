package com.activity.snhs.Grade9.Filipino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade9.ESP.EspActivity;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter32 );

        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("modules/filipino/filipino4.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter4.this, FilActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}