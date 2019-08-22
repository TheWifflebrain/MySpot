package com.example.myspot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public Button buttonCalculate;
    public Button buttonReset;
    public EditText setNumSpots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalculate = findViewById(R.id.calc);
        buttonReset = findViewById(R.id.reset);
        setNumSpots = findViewById(R.id.numSpots);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });

        buttonReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });
    }

    public int josephusCalculations(int spots){
        return spots;
    }
}
