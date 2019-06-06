package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class e2_menu extends AppCompatActivity implements View.OnClickListener {
    private CardView vid1, vid2,vid3,vid4,vid5,vid6,vid7,vid8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_e2_menu);

        // Defining
        vid1 = (CardView) findViewById(R.id.cd_m2vid1);
        vid2 = (CardView) findViewById(R.id.cd_m2vid2);
        vid3 = (CardView) findViewById(R.id.cd_m2vid3);
        vid4 = (CardView) findViewById(R.id.cd_m2vid4);
        vid5 = (CardView) findViewById(R.id.cd_m2vid5);
        vid6 = (CardView) findViewById(R.id.cd_m2vid6);
        vid7 = (CardView) findViewById(R.id.cd_m2vid7);
        vid8 = (CardView) findViewById(R.id.cd_m2vid8);
        //Assigning
        vid1.setOnClickListener(this);
        vid2.setOnClickListener(this);
        vid3.setOnClickListener(this);
        vid4.setOnClickListener(this);
        vid5.setOnClickListener(this);
        vid6.setOnClickListener(this);
        vid7.setOnClickListener(this);
        vid8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent i;

        switch (v.getId()) {
            case R.id.cd_m2vid1 : i = new Intent (this,vid_player.class); i.putExtra("vidCue", "Xeb4BWnnAyQ");startActivity(i); break ;
            case R.id.cd_m2vid2 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "6nVFdvteONE");startActivity(i); break ;
            case R.id.cd_m2vid3 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "GHBWbwQqZS8");startActivity(i); break ;
            case R.id.cd_m2vid4 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "LwH5fklaFBY");startActivity(i); break ;
            case R.id.cd_m2vid5 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "EgCLBtrZs5c");startActivity(i); break ;
            case R.id.cd_m2vid6 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "bLAdVAJYEXw");startActivity(i); break ;
            case R.id.cd_m2vid7 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "JqCXF7GXI04");startActivity(i); break ;
            case R.id.cd_m2vid8 : i = new Intent (this,vid_player.class);i.putExtra("vidCue", "SS7jsQPkmHs");startActivity(i); break ;
            default:break;
        }
    }
}
