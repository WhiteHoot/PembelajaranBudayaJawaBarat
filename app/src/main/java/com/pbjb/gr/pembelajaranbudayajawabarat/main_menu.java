package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;


public class main_menu extends AppCompatActivity{

    RecyclerView recyclerView;
    ArrayList<MenuList> menuLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_menu);

        recyclerView = findViewById(R.id.rv);

        menuLists = new ArrayList<>();

        menuLists.add(new MenuList(R.drawable.cd_m1, R.drawable.enc_icon2, getApplication().getResources().getColor(R.color.cd_m1), "Ensiklopedia", "Pelajari Budayanya Disini!"));
        menuLists.add(new MenuList(R.drawable.cd_m2, R.drawable.quiz_icon1, getApplication().getResources().getColor(R.color.cd_m2), "Quiz", "Tes Kemampuanmu!"));
        menuLists.add(new MenuList(R.drawable.cd_m3, R.drawable.about_icon2, getApplication().getResources().getColor(R.color.cd_m3), "Tentang", "Tentang Aplikasi"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = layoutManager;
        recyclerView.setLayoutManager(rvLayoutManager);

        rvAdapter adapter = new rvAdapter(this,menuLists);

        recyclerView.setAdapter(adapter);

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
