package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart", "Hola");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "Hola");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "Hola");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "Hola");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "Hola");
    }
}