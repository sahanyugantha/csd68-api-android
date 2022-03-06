package com.sahan.csd68appone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        EditText etHeight = (EditText) findViewById(R.id.etHeight);
        EditText etWeight = (EditText) findViewById(R.id.etWeight);
        TextView tvBmiVal = (TextView) findViewById(R.id.tvBmiValue);
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String height_str = etHeight.getText().toString();
                float height = Float.parseFloat(height_str);

                Toast.makeText(getApplicationContext(), "Height : "+height, Toast.LENGTH_SHORT).show();


                //tvBmiVal.setText("Your BMI is - "+);

            }
        });

    }
}