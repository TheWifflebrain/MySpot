package com.example.myspot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public Button buttonCalculate;
    public Button buttonReset;
    public EditText setNumSpots;
    public TextView txtResults;
    public String numSpots = "1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalculate = findViewById(R.id.calc);
        buttonReset = findViewById(R.id.reset);
        setNumSpots = findViewById(R.id.numSpots);
        txtResults = findViewById(R.id.results);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numSpots = setNumSpots.getText().toString();

                if(numSpots.equals(" ")){
                    numSpots = "1";
                }

                int spots = Integer.parseInt(numSpots);
                spots = josephusCalculations(spots);

                numSpots = String.valueOf(spots);
                txtResults.append(numSpots);

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
