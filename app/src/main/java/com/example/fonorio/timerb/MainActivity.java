package com.example.fonorio.timerb;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//TODO

// []bundle is not necessary, put data using intent.putExtras
//        period in milliseconds, long
//[x]create Intent
//[x]add data to intent
//[x]create IntentService(?) with getService passing in intent
//   [x] actually store it in a PendinIntent
//[x]get AlarmManager and give it the pendingIntent and setExact to the currentTime + period and RC_WAKE
//
//[]onHandleIntent
//    [x]vibrates
//    []checks if intent.data contains a stop instruction, if it does stop service
//    []gets AlarmManager and give it the pendingIntent and setExact to the currentTime + period
//    []consider thread exceptions for interruption
//
// []REcheck example for sanity checks https://developer.android.com/guide/components/services.html#ExtendingIntentService


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(getApplicationContext(), MyIntentService.class);

        intent.putExtra("periodInSeconds", 5);
        PendingIntent pendingIntent = PendingIntent.getService(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
        long nextAlarmTime = SystemClock.elapsedRealtime() + 5000;
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, nextAlarmTime, pendingIntent);
        Toast.makeText(getApplicationContext(),"Toast test 1", Toast.LENGTH_SHORT).show();
    }
}
