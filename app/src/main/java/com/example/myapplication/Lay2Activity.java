package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Lay2Activity extends AppCompatActivity {
    TextView txv1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    LinearLayout lay5;

    TranslateAnimation anim1 = new TranslateAnimation(0, 0,-300, 0);
    TranslateAnimation anim2 = new TranslateAnimation(-1000, 0,0, 0);
    TranslateAnimation anim3 = new TranslateAnimation(0, 0,-1000, 0);
    TranslateAnimation anim4 = new TranslateAnimation(1000, 0,0, 0);
    TranslateAnimation anim5 = new TranslateAnimation(0, 0,1000, 0);

    int time1 = 1000;
    int time2 = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_2);
        map();
        anim1.setDuration(time1);
        anim2.setDuration(time2);
        anim3.setDuration(time2);
        anim4.setDuration(time2);
        anim5.setDuration(time2);
        run();
    }

    private void run(){
        img2.setTranslationX(-1000);
        img3.setTranslationY(-1000);
        img4.setTranslationX(1000);
        lay5.setTranslationY(1000);
        txv1.startAnimation(anim1);
        new CountDownTimer(time1,100){
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                txv1.setTranslationY(0);
                img2.setTranslationX(0);
                img3.setTranslationY(0);
                img4.setTranslationX(0);
                lay5.setTranslationY(0);
                img2.startAnimation(anim2);
                img3.startAnimation(anim3);
                img4.startAnimation(anim4);
                lay5.startAnimation(anim5);
                new CountDownTimer(time1,100){
                    @Override
                    public void onTick(long l) {
                    }
                    @Override
                    public void onFinish() {
                        img2.setTranslationX(0);
                        img3.setTranslationY(0);
                        img4.setTranslationX(0);
                        lay5.setTranslationY(0);
                    }
                }.start();
            }
        }.start();
    }
    private void map() {
        txv1 = findViewById(R.id.txv1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        lay5 = findViewById(R.id.lay5);
    }
}