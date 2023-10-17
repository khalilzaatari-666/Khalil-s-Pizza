package com.vo1d.pizzaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Create a thread for the delay
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    // Sleep for 2000 milliseconds (2 seconds)
                    sleep(2000);
                    // Create an intent to start the ListPizzaActivity
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    // Finish the current SplashActivity
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Start the thread
        t1.start();
    }
}
