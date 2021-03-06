package br.com.adrianoantonucci.meninooumenina;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 6000);
    }
}
