package com.example.healthandfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleNutritionPrograms extends AppCompatActivity {
    Button buttone1500e1;
    Button buttone1500e2;
    Button buttone2000e1;
    Button buttone2000e2;
    Button buttone2500e1;
    Button buttone2500e2;
    Button buttone3000e1;
    Button buttone3000e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_nutrition_programs);

        buttone1500e1=findViewById(R.id.btn1);
        buttone1500e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e1500e1 = new Intent(getApplicationContext(),e1500e1.class);
                startActivity(e1500e1);
            }
        });
        buttone1500e2=findViewById(R.id.btn2);
        buttone1500e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e1500e2 = new Intent(getApplicationContext(),e1500e2.class);
                startActivity(e1500e2);
            }
        });
        buttone2000e1=findViewById(R.id.btn3);
        buttone2000e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e2000e1 = new Intent(getApplicationContext(),e2000e1.class);
                startActivity(e2000e1);
            }
        });
        buttone2000e2=findViewById(R.id.btn4);
        buttone2000e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e2000e2 = new Intent(getApplicationContext(),e2000e2.class);
                startActivity(e2000e2);
            }
        });
        buttone2500e1=findViewById(R.id.btn5);
        buttone2500e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e2500e1 = new Intent(getApplicationContext(),e2500e1.class);
                startActivity(e2500e1);
            }
        });
        buttone2500e2=findViewById(R.id.btn6);
        buttone2500e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e2500e2 = new Intent(getApplicationContext(),e2500e2.class);
                startActivity(e2500e2);
            }
        });
        buttone3000e1=findViewById(R.id.btn7);
        buttone3000e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e3000e1 = new Intent(getApplicationContext(),e3000e1.class);
                startActivity(e3000e1);
            }
        });
        buttone3000e2=findViewById(R.id.btn8);
        buttone3000e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e3000e2 = new Intent(getApplicationContext(),e3000e2.class);
                startActivity(e3000e2);
            }
        });
    }

}