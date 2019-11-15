package com.example.greenhouses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Steps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);

    }

    public void goToHome(View view) {
    }

    public void goToPart11(View view) {
        Intent goToPart11 = new Intent(this, Part11.class);
        startActivity(goToPart11);
    }

    public void goToPart21(View view) {
        Intent goToPart21 = new Intent(this, Part21.class);
        startActivity(goToPart21);
    }

    public void goToPart31(View view) {
    }

    public void goToPart41(View view) {
    }

    public void goToPart51(View view) {
    }

    public void goToPart61(View view) {
    }

    public void goToNextInSteps(View view) {
    }
}
