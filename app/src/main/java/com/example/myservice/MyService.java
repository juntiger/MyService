package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Button;

public class MyService extends Service {

    Button btn_stop;

    static MediaPlayer mp3;
    public MyService() {
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mp3 = MediaPlayer.create(getApplicationContext(), R.raw.goodday);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mp3.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void pause(){
        mp3.pause();
    }
}
