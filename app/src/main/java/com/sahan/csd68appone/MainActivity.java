package com.sahan.csd68appone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "I'm at onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "I'm at onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "I'm at onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "I'm at onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "I'm at onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "I'm at onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "I'm at onDestroy");
    }
}