package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Lay3Activity extends AppCompatActivity {
RelativeLayout lay1,lay2;
RelativeLayout lay3,lay4;
RelativeLayout lay5,lay6;
    TextView txv1;

    int time1 = 1000;
    int tr=10000;
    TranslateAnimation anim = new TranslateAnimation(0, 0,-300, 0);
    TranslateAnimation anim1 = new TranslateAnimation(-500, 0,0, 0);
    TranslateAnimation anim2 = new TranslateAnimation(500, 0,0, 0);
    TranslateAnimation anim3 = new TranslateAnimation(-500, 0,0, 0);
    TranslateAnimation anim4 = new TranslateAnimation(500, 0,0, 0);
    TranslateAnimation anim5 = new TranslateAnimation(-500, 0,0, 0);
    TranslateAnimation anim6 = new TranslateAnimation(500, 0,0, 0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_3);
        map();
        lay1.setTranslationX(tr);
        lay2.setTranslationX(tr);
        lay3.setTranslationX(tr);
        lay4.setTranslationX(tr);
        lay5.setTranslationX(tr);
        lay6.setTranslationX(tr);
        anim.setDuration(time1);
        anim1.setDuration(time1);
        anim2.setDuration(time1);
        anim3.setDuration(time1);
        anim4.setDuration(time1);
        anim5.setDuration(time1);
        anim6.setDuration(time1);

        txv1.startAnimation(anim);
        new CountDownTimer(time1,100){
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                txv1.setTranslationY(0);
                runs();
            }
        }.start();
    }
private void map(){
    txv1  = findViewById(R.id.txv1);
    lay1  = findViewById(R.id.lay1);
    lay2  = findViewById(R.id.lay2);
    lay3  = findViewById(R.id.lay3);
    lay4  = findViewById(R.id.lay4);
    lay5  = findViewById(R.id.lay5);
    lay6  = findViewById(R.id.lay6);
}
    private void runs(){
        lay1.setTranslationX(0);
        lay2.setTranslationX(0);
        lay1.startAnimation(anim1);
        lay2.startAnimation(anim2);
        new CountDownTimer(time1,100) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                lay1.setTranslationX(0);
                lay2.setTranslationX(0);

                lay3.setTranslationX(0);
                lay4.setTranslationX(0);
                lay3.startAnimation(anim3);
                lay4.startAnimation(anim4);
                new CountDownTimer(time1,100) {
                    @Override
                    public void onTick(long l) {
                    }

                    @Override
                    public void onFinish() {
                        lay3.setTranslationX(0);
                        lay4.setTranslationX(0);

                        lay5.setTranslationX(0);
                        lay6.setTranslationX(0);
                        lay5.startAnimation(anim5);
                        lay6.startAnimation(anim6);
                        new CountDownTimer(time1,100) {
                            @Override
                            public void onTick(long l) {
                            }

                            @Override
                            public void onFinish() {
                                lay5.setTranslationX(0);
                                lay6.setTranslationX(0);

                            }
                        }.start();
                    }
                }.start();
            }
        }.start();
    }
}