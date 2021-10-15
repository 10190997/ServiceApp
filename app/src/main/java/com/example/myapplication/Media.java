package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class Media extends Service {
    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Создано", Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Запущено", Toast.LENGTH_SHORT).show();
        mediaPlayer.start();
        return  START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Остановлено", Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
    }
}