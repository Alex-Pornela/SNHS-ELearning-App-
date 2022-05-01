package com.activity.snhs.Grade8.Science;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade8.Math.MathActivity;
import com.activity.snhs.Grade8.Math.Quarter4;
import com.activity.snhs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Quarter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quarter133 );


        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("grade8/science/science1.pdf").load();


        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Quarter1.this, MathActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}