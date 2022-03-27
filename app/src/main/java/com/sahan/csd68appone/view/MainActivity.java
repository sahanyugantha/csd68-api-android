package com.sahan.csd68appone.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sahan.csd68appone.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "I'm at onCreate");
        setContentView(R.layout.activity_main);

        Button btnOpenBmi = (Button) findViewById(R.id.btn_open_bmi);
        Button btnOpenHome = (Button) findViewById(R.id.btnOpenHome);
        btnOpenBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Opening HealthActivity.
                Intent healthIntent = new Intent(getApplicationContext(), HealthActivity.class);
                startActivity(healthIntent);

                Toast.makeText(getApplicationContext(), "Opening BMI...", Toast.LENGTH_SHORT).show();
            }
        });

        btnOpenHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(homeIntent);
            }
        });


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