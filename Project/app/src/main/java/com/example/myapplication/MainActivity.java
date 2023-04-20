package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.CalculatorActivity;
import com.example.myapplication.ExerciseListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get calculatorBtn and set the onClickListener
        Button calculatorBtn = (Button) findViewById(R.id.calculatorBtn);
        calculatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showCalculatorActivity = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(showCalculatorActivity);
            }
        });

        // Get exerciseBtn and set the onClickListener
        Button exerciseBtn = (Button) findViewById(R.id.listViewBtn);
        exerciseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showExerciseActivity = new Intent(getApplicationContext(), ExerciseListActivity.class);
                startActivity(showExerciseActivity);
            }
        });

        // Get googleBtn and set the onClickListener
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.google.com";
                Uri webAddress = Uri.parse(link);

                Intent showGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
                try {
                    startActivity(showGoogle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}