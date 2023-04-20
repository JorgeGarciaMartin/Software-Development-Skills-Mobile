package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button sumBtn = (Button) findViewById(R.id.sumBtn);
        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the two numbers
                EditText firstNumber = (EditText) findViewById(R.id.editTextNumber);
                EditText secondNumber = (EditText) findViewById(R.id.editTextNumber2);

                // Try to parse the numbers
                try {
                    double num1 = Double.parseDouble(firstNumber.getText().toString());
                    double num2 = Double.parseDouble(secondNumber.getText().toString());

                    // Calculate the sum
                    double sum = num1 + num2;

                    // Display the sum
                    TextView result = (TextView) findViewById(R.id.resultText);
                    result.setText(Double.toString(sum));
                } catch (NumberFormatException e) {
                    // If the numbers are invalid, display an error message
                    TextView result = (TextView) findViewById(R.id.resultText);
                    result.setText("Provide both numbers");
                }
            }
        });
    }
}