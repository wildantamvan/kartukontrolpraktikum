package com.wildantamvan.kartukontrol2.feature;

/**
 * Created by wildan on 1/2/2018.
 */

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*handler untuk menahan activity sementara*/
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*mulai activity ke MainActivity setelah 5 detik*/
                PrefManager prefManager = new PrefManager(getApplicationContext());
                startActivity(new Intent(SplashScreen.this, WelcomeActivity.class));
//                finish();
//
//
//                startActivity(new Intent(getApplicationContext(),MainActivity.class));


//                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
            /*durasi 5000ms*/
        },5000);
    }
}