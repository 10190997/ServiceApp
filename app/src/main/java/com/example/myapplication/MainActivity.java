package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, MyService.class);
        Intent i2 = new Intent(this, Media.class);
        if (view.getId() == R.id.button2) {
            startService(i);
            startService(i2);
        }
        else {
            stopService(i);
            stopService(i2);
        }
    }
}