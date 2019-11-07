package com.leakcanary2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Thread.sleep(1000);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Intent itt = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(itt);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
