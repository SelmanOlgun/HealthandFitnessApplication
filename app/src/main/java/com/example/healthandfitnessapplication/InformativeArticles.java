package com.example.healthandfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformativeArticles extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informative_articles);

        button1=findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn1 = new Intent(getApplicationContext(),Articles1.class);
                startActivity(buttonn1);
            }
        });
        button2=findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn2 = new Intent(getApplicationContext(),Articles2.class);
                startActivity(buttonn2);
            }
        });
        button3=findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn3 = new Intent(getApplicationContext(),Articles3.class);
                startActivity(buttonn3);
            }
        });
        button4=findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn4 = new Intent(getApplicationContext(),Articles4.class);
                startActivity(buttonn4);
            }
        });
        button5=findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn5 = new Intent(getApplicationContext(),Articles5.class);
                startActivity(buttonn5);
            }
        });
        button6=findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn6 = new Intent(getApplicationContext(),Articles6.class);
                startActivity(buttonn6);
            }
        });
        button7=findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn7 = new Intent(getApplicationContext(),Articles7.class);
                startActivity(buttonn7);
            }
        });
        button8=findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonn8 = new Intent(getApplicationContext(),Articles8.class);
                startActivity(buttonn8);
            }
        });

    }
}