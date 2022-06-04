package com.cashmanagementtracker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;


public class SplashScreen extends Activity {

    Intent CallMain;
    LinearLayout bgLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        bgLinearLayout = (LinearLayout) findViewById(R.id.bgLinearLayout);
        bgLinearLayout.setBackgroundColor(Color.parseColor("#825939"));
        CallMain = new Intent(".MainActivity");

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                finally {
                    startActivity(CallMain);
                    finish();
                }
            }
        };
        timer.start();
    }
}
