package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

public class slider extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        enableLastSlideAlphaExitTransition(false);

        getBackButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m1)
                        .buttonsColor(R.color.m1)
                        .image(R.drawable.m1_icon_1)
                        .title("Senjata Tradisional")
                        .description("Ayo kita cari tahu senjata tradisional di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e1_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m2)
                        .buttonsColor(R.color.m2)
                        .image(R.drawable.m2_icon_1)
                        .title("Tarian Tradisional")
                        .description("Ayo kita cari tahu tarian tradisional di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e2_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m3)
                        .buttonsColor(R.color.m3)
                        .image(R.drawable.m3_icon_1)
                        .title("Rumah Tradisional")
                        .description("Ayo kita cari tahu rumah tradisional di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e3_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m4)
                        .buttonsColor(R.color.m4)
                        .image(R.drawable.m4_icon_1)
                        .title("Kesenian")
                        .description("Ayo kita cari tahu kesenian di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e4_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m5)
                        .buttonsColor(R.color.m5)
                        .image(R.drawable.m5_icon)
                        .title("Wisata")
                        .description("Ayo kita cari tahu wisata di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e5_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.m6)
                        .buttonsColor(R.color.m6)
                        .image(R.drawable.m6_icon)
                        .title("Kuliner")
                        .description("Ayo kita cari tahu kuliner di Jawa Barat!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(slider.this, e6_menu.class);
                        startActivity(in);
                    }
                },"Mulai"));
    }

    @Override
    public void onBackPressed() {

        finish();
        Intent intent = new Intent(slider.this, main_menu.class);
        startActivity(intent);
    }

    @Override
    public void onFinish() {
        super.onFinish();
    }
}