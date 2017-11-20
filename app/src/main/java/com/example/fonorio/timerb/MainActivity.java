package com.example.fonorio.timerb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//TODO
//create bundle with data
//        period in milliseconds
//create Intent
//add data to intent
//create IntentService(?) with getService passing in intent
//    actually store it in a PendinIntent
//get AlarmManager and give it the pendingIntent and setExact to the currentTime + period and RC_WAKE
//
//onHandleIntent
//    vibrates
//    checks if intent.data contains a stop instruction, if it does stop service
//    gets AlarmManager and give it the pendingIntent and setExact to the currentTime + period
//    consider thread exceptions for interruption
//
// []REcheck example for sanity checks https://developer.android.com/guide/components/services.html#ExtendingIntentService


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
