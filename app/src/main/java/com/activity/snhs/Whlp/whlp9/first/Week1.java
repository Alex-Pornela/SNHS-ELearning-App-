package com.activity.snhs.Whlp.whlp9.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.Grade7.AP.ApActivity;
import com.activity.snhs.Grade7.AP.Quarter1;
import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp9.FirstWhlp9;
import com.github.barteksc.pdfviewer.PDFView;

public class Week1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_week1 );

        String message = getIntent().getStringExtra("message_key");

        if(message.equals( "week1" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w1.pdf").load();
        }

        if(message.equals( "week2" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w2.pdf").load();
        }
        if(message.equals( "week3" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w3.pdf").load();
        }
        if(message.equals( "week4" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w4.pdf").load();
        }
        if(message.equals( "week5" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w5.pdf").load();
        }
        if(message.equals( "week6" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w6.pdf").load();
        }
        if(message.equals( "week7" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w7.pdf").load();
        }
        if(message.equals( "week8" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q1/w8.pdf").load();
        }




        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Week1.this, FirstWhlp9.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }

}