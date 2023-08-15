package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class Lay1Activity extends AppCompatActivity {
TextView txv1;
ImageView img1;
ImageView img2;
int time1 = 1000;
    int time2 = 3000;
    int px=600;
    TranslateAnimation anim1 = new TranslateAnimation(0, 0,-300, 0);
    TranslateAnimation anim2 ;
    TranslateAnimation anim3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_1);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        px = width;
        anim2 = new TranslateAnimation(px, 0,0, 0);
         anim3 = new TranslateAnimation(-px, 0,0, 0);
        map();
        anim1.setDuration(time1);
        anim2.setDuration(time2);
        anim3.setDuration(time2);
      run();
    }
    private void run(){
        txv1.startAnimation(anim1);
        img1.setTranslationX(px);
        img2.setTranslationX(-px);
        new CountDownTimer(time1,100){
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                txv1.setTranslationY(0);
                img1.setTranslationX(0);
                img2.setTranslationX(0);
                img1.startAnimation(anim2);
                img2.startAnimation(anim3);
                new CountDownTimer(time2,100){
                    @Override
                    public void onTick(long l) {
                    }
                    @Override
                    public void onFinish() {
                        img1.setTranslationX(0);
                        img2.setTranslationX(0);
                    }
                }.start();
            }
        }.start();
    }
    private void map() {
        txv1 = findViewById(R.id.txv1);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
    }
}