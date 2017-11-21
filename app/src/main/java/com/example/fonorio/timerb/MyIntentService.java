package com.example.fonorio.timerb;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by win_second_lobster on 11/20/2017.
 */

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("MyIntentServiceThreadNameDefaultString");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);
        System.out.println("Intent handled");
    }
}
