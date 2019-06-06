package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class main_menu extends AppCompatActivity implements View.OnClickListener {
    private CardView encMenu, quizMenu, aboutMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_menu);
        // Defining
        encMenu = (CardView) findViewById(R.id.enc_Menu);
        quizMenu = (CardView) findViewById(R.id.quiz_Menu);
        aboutMenu = (CardView) findViewById(R.id.abo_Menu);
        //Assigning
        encMenu.setOnClickListener(this);
        quizMenu.setOnClickListener(this);
        aboutMenu.setOnClickListener(this);
}

@Override
    public void onClick(View v){
        Intent i;

        switch (v.getId()) {
            case R.id.enc_Menu : i = new Intent (this,slider.class);startActivity(i); break ;
            case R.id.quiz_Menu : i = new Intent (this,starting_quiz.class);startActivity(i); break ;
            case R.id.abo_Menu : i = new Intent (this,about_menu.class);startActivity(i); break ;
            default:break;
        }
}
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(main_menu.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
