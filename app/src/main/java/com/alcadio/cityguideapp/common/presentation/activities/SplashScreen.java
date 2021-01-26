package com.alcadio.cityguideapp.common.presentation.activities;

import android.content.Intent;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.alcadio.cityguideapp.R;
import com.alcadio.cityguideapp.session.presentation.activities.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    private TextView appBatman, batmanForever, powered_byLine;
    private ImageView imgBatman_01;

    private Animation sideAnim, bottomAnim, topAnim;

    private static int SPLASH_TIMER = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);


        appBatman = findViewById(R.id.app_batman);
        batmanForever = findViewById(R.id.batman_forever);
        imgBatman_01 = findViewById(R.id.imgBatman_01);
        powered_byLine = findViewById(R.id.powered);

        //Animations
        sideAnim = AnimationUtils.loadAnimation(this,R.anim.sid_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);

        imgBatman_01.setAnimation(sideAnim);
        appBatman.setAnimation(bottomAnim);
        batmanForever.setAnimation(topAnim);
        powered_byLine.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotToLogin();
            }
        },SPLASH_TIMER);
    }

    private void gotToLogin(){
        Intent i = new Intent(SplashScreen.this, LoginActivity.class);
        startActivity(i);
    }
}