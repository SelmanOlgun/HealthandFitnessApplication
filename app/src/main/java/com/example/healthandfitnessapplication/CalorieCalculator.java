package com.example.healthandfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalorieCalculator extends AppCompatActivity {

    EditText Age,Height,Weight;
    TextView KaloriSonuc,GorunurYap;
    RadioButton Male,Female,Sedentary,Light,Moderate,Heavy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);
        Male= (RadioButton) findViewById(R.id.rbMale);
        Female= (RadioButton) findViewById(R.id.rbFemale);
        Sedentary = (RadioButton) findViewById(R.id.rbSedentary);
        Light= (RadioButton) findViewById(R.id.rbLight);
        Moderate= (RadioButton) findViewById(R.id.rbModerate);
        Heavy= (RadioButton) findViewById(R.id.rbHeavy);

    }


    public void sayisaldeger(View view) {

        Age = (EditText) findViewById(R.id.textAge);
        Height = (EditText) findViewById(R.id.textHeight);
        Weight = (EditText) findViewById(R.id.textWeight);
        KaloriSonuc = (TextView) findViewById(R.id.tvSonuc);
        GorunurYap = (TextView) findViewById(R.id.Almanizgereken);

        if (Male.isChecked()){
            if(Sedentary.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.17*((13.75*Weight1) + (5*Height1) - (5*Age1) + 66);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Light.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.34*((13.75*Weight1) + (5*Height1) - (5*Age1) + 66);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Moderate.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.51*((13.75*Weight1) + (5*Height1) - (5*Age1) + 66);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Heavy.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.68*((13.75*Weight1) + (5*Height1) - (5*Age1) + 66);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }



        }
        if (Female.isChecked()){
            if(Sedentary.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.19*((9.56*Weight1) + (1.85*Height1) - (4.68*Age1) + 655);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Light.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.36*((9.56*Weight1) + (1.85*Height1) - (4.68*Age1) + 655);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Moderate.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.53*((9.56*Weight1) + (1.85*Height1) - (4.68*Age1) + 655);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }
            else if(Heavy.isChecked()){
                double  Age1    = Double.parseDouble(Age.getText().toString());
                double  Height1 = Double.parseDouble(Height.getText().toString());
                double  Weight1 = Double.parseDouble(Weight.getText().toString());
                double sonucerkek= 1.70*((9.56*Weight1) + (1.85*Height1) - (4.68*Age1) + 655);
                KaloriSonuc.setText(String.valueOf(sonucerkek));
                GorunurYap.setText("Your Maintenance Calories");
            }

        }





    }

}
