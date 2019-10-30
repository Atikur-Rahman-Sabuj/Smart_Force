package com.smartsheba.smartforce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen easySplashScreen=new EasySplashScreen(SplashScreenActivity.this);
        easySplashScreen.withBackgroundResource(R.color.white)

                .withLogo(R.drawable.splash_smart_force)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000);

        View view = easySplashScreen.create();
        setContentView(view);
        //setContentView(R.layout.activity_splash_screen);
    }
}
