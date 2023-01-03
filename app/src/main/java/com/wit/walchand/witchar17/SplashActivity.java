package com.wit.walchand.witchar17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView tv = (TextView)findViewById(R.id.tv_fade_in);
        ImageView imageView = (ImageView)findViewById(R.id.splashImage);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        Thread thread = new Thread() {
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openMainActivity = new Intent("com.wit.walchand.witchar17.Intro");
                    startActivity(openMainActivity);
                }
            }
        };
        thread.start();
        tv.startAnimation(animation);
        imageView.startAnimation(animation);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

