package com.example.healthandfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleWorkoutPrograms extends AppCompatActivity {
    Button buttonfullbody1;
    Button buttonfullbody2;
    Button buttontwodaysplit1;
    Button buttontwodaysplit2;
    Button buttonpushpulllegs1;
    Button buttonpushpulllegs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_workout_programs);

        buttonfullbody1=findViewById(R.id.btnFullbody1);
        buttonfullbody1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullbody1 = new Intent(getApplicationContext(),FullbodyProgram1.class);
                startActivity(fullbody1);
            }
        });
        buttonfullbody2=findViewById(R.id.btnFullbody2);
        buttonfullbody2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullbody2 = new Intent(getApplicationContext(),FullbodyProgram2.class);
                startActivity(fullbody2);
            }
        });
        buttontwodaysplit1=findViewById(R.id.btnTwoDaySplit1);
        buttontwodaysplit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twodaysplit1 = new Intent(getApplicationContext(),TwoDaySplitProgram1.class);
                startActivity(twodaysplit1);
            }
        });
        buttontwodaysplit2=findViewById(R.id.btnTwoDaySplit2);
        buttontwodaysplit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twodaysplit2 = new Intent(getApplicationContext(),TwoDaySplitProgram2.class);
                startActivity(twodaysplit2);
            }
        });
        buttonpushpulllegs1=findViewById(R.id.btnPushPullLegs1);
        buttonpushpulllegs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushpulllegs1 = new Intent(getApplicationContext(),PushPullLegsProgram1.class);
                startActivity(pushpulllegs1);
            }
        });
        buttonpushpulllegs2=findViewById(R.id.btnPushPullLegs2);
        buttonpushpulllegs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushpulllegs2 = new Intent(getApplicationContext(),PushPullLegsProgram2.class);
                startActivity(pushpulllegs2);
            }
        });



    }
}