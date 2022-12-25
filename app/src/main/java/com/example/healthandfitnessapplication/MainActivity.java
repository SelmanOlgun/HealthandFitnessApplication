package com.example.healthandfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonCalorie1;
    Button buttonNutrition1;
    Button buttonWorkout1;
    Button buttonArticles1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalorie1=findViewById(R.id.btnCalorie);
        buttonCalorie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calorie = new Intent(getApplicationContext(),CalorieCalculator.class);
                startActivity(calorie);
            }
        });
        buttonNutrition1=findViewById(R.id.btnNutrition);
        buttonNutrition1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nutrition = new Intent(getApplicationContext(),SampleNutritionPrograms.class);
                startActivity(nutrition);
            }
        });

        buttonWorkout1=findViewById(R.id.btnWorkout);
        buttonWorkout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workout = new Intent(getApplicationContext(),SampleWorkoutPrograms.class);
                startActivity(workout);
            }
        });

        buttonArticles1=findViewById(R.id.btnArticles);
        buttonArticles1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent articles = new Intent(getApplicationContext(),InformativeArticles.class);
                startActivity(articles);
            }
        });





    }
}