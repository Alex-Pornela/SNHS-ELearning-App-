package com.activity.snhs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.activity.snhs.Grade10.MainActivity4;
import com.activity.snhs.Grade7.MainActivity1;
import com.activity.snhs.Grade8.MainActivity2;
import com.activity.snhs.Grade9.MainActivity3;
import com.activity.snhs.Whlp.Whlp;

public class MainActivity extends AppCompatActivity {

    ImageView seven_btn, eight_btn, nine_btn, ten_btn,menu_btn;
    Dialog dialog;
    TextView whlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        ten_btn = findViewById(R.id.ten_btn);
        menu_btn = findViewById(R.id.menu_btn);
        whlp = findViewById(R.id.whlp);



        menu_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog( MainActivity.this );

                dialog.setContentView( R.layout.menu_layout );
               dialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );

                Button teacherBtn = dialog.findViewById( R.id.teacher_btn );
                Button aboutBtn = dialog.findViewById( R.id.about_btn );
                Button exitBtn = dialog.findViewById( R.id.exit_btn );
                ImageView close_menu = dialog.findViewById(R.id.close_menu);

                close_menu.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                } );

                teacherBtn.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, TeacherActivity.class );
                        startActivity( intent );
                        finish();
                    }
                } );

                aboutBtn.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, About.class );
                        startActivity( intent );
                        finish();

                    }
                } );

                exitBtn.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
                        View view = LayoutInflater.from(MainActivity.this).inflate(
                                R.layout.exit_dialog_layout,
                                (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
                        );
                        builder.setView(view);
                        ((TextView) view.findViewById(R.id.textTitle)).setText("SNHS");
                        ((TextView) view.findViewById(R.id.textMessage)).setText("Do you want to exit?");
                        ((Button) view.findViewById(R.id.buttonYes)).setText("Yes");
                        ((Button) view.findViewById(R.id.buttonNo)).setText("No");
                        ((ImageView) view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.warning);

                        final AlertDialog alertDialog = builder.create();

                        view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        });

                        view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                alertDialog.dismiss();
                            }
                        });

                        if (alertDialog.getWindow() != null){
                            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        }
                        alertDialog.show();
                    }
                } );


                dialog.show();


            }
        } );


        seven_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity1.class );
                startActivity( intent );
                finish();
            }
        } );

        eight_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class );
                startActivity( intent );
                finish();
            }
        } );

        nine_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class );
                startActivity( intent );
                finish();
            }
        } );

        ten_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class );
                startActivity( intent );
                finish();
            }
        } );

        whlp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Whlp.class );
                startActivity( intent );
                finish();
            }
        } );

    }




    @Override
    public void onBackPressed () {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.exit_dialog_layout,
                (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitle)).setText("SNHS");
        ((TextView) view.findViewById(R.id.textMessage)).setText("Do you want to exit?");
        ((Button) view.findViewById(R.id.buttonYes)).setText("Yes");
        ((Button) view.findViewById(R.id.buttonNo)).setText("No");
        ((ImageView) view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.warning);

        final AlertDialog alertDialog = builder.create();

        view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}