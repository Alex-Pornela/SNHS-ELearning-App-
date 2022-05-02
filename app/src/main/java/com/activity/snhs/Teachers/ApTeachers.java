package com.activity.snhs.Teachers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.activity.snhs.Grade7.English.EnglishActivity;
import com.activity.snhs.Grade7.English.Quarter1;
import com.activity.snhs.Grade7.MainActivity1;
import com.activity.snhs.R;
import com.activity.snhs.TeacherActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class ApTeachers extends AppCompatActivity {

    ImageView back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ap_teachers );

        back_arrow = findViewById( R.id.back_arrow );


        back_arrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ApTeachers.this, TeacherActivity.class);
                startActivity(intent);
                finish();
            }
        } );


        PDFView pdfView =  findViewById(R.id.pdfView);

        pdfView.fromAsset("teachers/ap.pdf").load();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( ApTeachers.this, TeacherActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}