package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class e4_menu extends AppCompatActivity implements View.OnClickListener {
    private CardView vid1, vid2,vid3,vid4,vid5,vid6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Full screen is set for the Window
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_e4_menu);

        Button buttonAR1 = findViewById(R.id.btn_ar1);
        buttonAR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAR1();
            }
        });

        // Defining
        vid1 = (CardView) findViewById(R.id.cd_m4vid1);
        vid2 = (CardView) findViewById(R.id.cd_m4vid2);
        vid3 = (CardView) findViewById(R.id.cd_m4vid3);
        vid4 = (CardView) findViewById(R.id.cd_m4vid4);
        vid5 = (CardView) findViewById(R.id.cd_m4vid5);
        vid6 = (CardView) findViewById(R.id.cd_m4vid6);

        //Assigning
        vid1.setOnClickListener(this);
        vid2.setOnClickListener(this);
        vid3.setOnClickListener(this);
        vid4.setOnClickListener(this);
        vid5.setOnClickListener(this);
        vid6.setOnClickListener(this);
    }

    private void startAR1() {
        Intent intent = new Intent(e4_menu.this, mid_ar1.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v){
        Intent i;

        switch (v.getId()) {
            case R.id.cd_m4vid1 : i = new Intent (this,vid_player.class); i.putExtra("vidCue", "dMcU8reHKiQ");startActivity(i); break ;
            case R.id.cd_m4vid2 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "7LnRWy5j6Vw");startActivity(i); break ;
            case R.id.cd_m4vid3 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "xHhUVThTJuI");startActivity(i); break ;
            case R.id.cd_m4vid4 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "MTzvEikyNoM");startActivity(i); break ;
            case R.id.cd_m4vid5 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "TozNzgC_C2I");startActivity(i); break ;
            case R.id.cd_m4vid6 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "5woU2Ur4-Z0");startActivity(i); break ;
            default:break;
        }
    }
}
