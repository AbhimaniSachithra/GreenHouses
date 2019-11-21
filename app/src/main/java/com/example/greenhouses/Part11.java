package com.example.greenhouses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part11);
    }

    public void goToPart12(View view) {
        Intent goToPart12 = new Intent(this, Part12.class);
        startActivity(goToPart12);
    }
}
