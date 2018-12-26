package com.example.rohit.timersinandroid;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer cdt=new CountDownTimer(10000,1000){
            public void onTick(long millisecondsUntilDone){
                Log.i("Seconds left",String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish(){
                Log.i("Finshed","Done");
            }
        };
        cdt.start();


        final Handler handler=new Handler();
        Runnable run=new Runnable() {
            @Override
            public void run() {
                Log.i("Timer 2 seconds","RUnning now");
                handler.postDelayed(this,1000);
            }
        };
        run.run();
    }
}
