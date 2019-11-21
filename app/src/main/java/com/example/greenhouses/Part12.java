package com.example.greenhouses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part12);
    }

    public void goToPart13(View view) {
        Intent goToPart13 = new Intent(this, Part13.class);
        startActivity(goToPart13);
    }
}
