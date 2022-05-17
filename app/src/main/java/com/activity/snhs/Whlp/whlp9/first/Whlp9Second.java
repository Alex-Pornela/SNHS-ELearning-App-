package com.activity.snhs.Whlp.whlp9.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.activity.snhs.R;
import com.activity.snhs.Whlp.whlp9.FirstWhlp9;
import com.github.barteksc.pdfviewer.PDFView;

public class Whlp9Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_whlp9_second );

        String message = getIntent().getStringExtra("message_key");

        if(message.equals( "week1" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w1.pdf").load();
        }

        if(message.equals( "week2" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w2.pdf").load();
        }
        if(message.equals( "week3" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w3.pdf").load();
        }
        if(message.equals( "week4" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w4.pdf").load();
        }
        if(message.equals( "week5" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w5.pdf").load();
        }
        if(message.equals( "week6" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w6.pdf").load();
        }
        if(message.equals( "week7" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w7.pdf").load();
        }
        if(message.equals( "week8" )){

            PDFView pdfView =  findViewById(R.id.pdfView);

            pdfView.fromAsset("whlp/grade9/q2/w8.pdf").load();
        }




        //backpress

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent( Whlp9Second.this, FirstWhlp9.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}