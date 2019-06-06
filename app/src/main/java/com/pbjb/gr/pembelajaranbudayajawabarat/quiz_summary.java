package com.pbjb.gr.pembelajaranbudayajawabarat;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class quiz_summary extends AppCompatActivity {

    private TextView textViewScore;
    private TextView textViewHighScore;
    private TextView textViewCorrectAnswers;
    private TextView textViewWrongAnswers;
    private TextView textMedal;
    private ImageView imageView;
    private String score;
    private int currentscore;
    private int wrongAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz_summary);

        imageView = findViewById(R.id.im_res);
        textViewCorrectAnswers = findViewById(R.id.text_view_ca_res);
        textViewWrongAnswers = findViewById(R.id.text_view_wa_res);
        textViewScore = findViewById(R.id.text_view_score);
        textViewHighScore = findViewById(R.id.text_view_highscore_res);
        textMedal = findViewById(R.id.texttitle);

        Intent intent = getIntent();
        score = intent.getStringExtra(quiz_menu.EXTRA_SCORE);
        currentscore = Integer.parseInt(score.toString());

        wrongAnswers = 30 - currentscore;

        textViewScore.setText("Score : " + currentscore);
        textViewCorrectAnswers.setText(":   "+score);
        textViewWrongAnswers.setText(":   "+wrongAnswers);


        if(currentscore == 30){
            textMedal.setText("Emas");
            imageView.setImageResource(R.drawable.gold_medal);
        }else if(currentscore >= 20 && currentscore <= 29){
            textMedal.setText("Perak");
            imageView.setImageResource(R.drawable.silver_medal);
        }else if(currentscore >= 10 && currentscore <= 19){
            textMedal.setText("Perunggu");
            imageView.setImageResource(R.drawable.bronze_medal);
        }else{
            textMedal.setText("Yaaaah");
            imageView.setImageResource((R.drawable.nomedal));
        }

        SharedPreferences settings = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE);
        int highscore = settings.getInt("KEY_HS", 0);

        if(currentscore > highscore){
            textViewHighScore.setText(":   "+currentscore);

            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("KEY_HS", currentscore);
            editor.commit();

        } else {
            textViewHighScore.setText(":   "+highscore);
        }
    }

    public void tryAgain(View view){
        startActivity(new Intent(getApplicationContext(), quiz_menu.class));
    }

    public void quitQuiz(View view){
        startActivity(new Intent(getApplicationContext(), main_menu.class));
    }

    @Override
    public void onBackPressed() {

        finish();
        Intent intent = new Intent(quiz_summary.this, starting_quiz.class);
        startActivity(intent);
    }
}
