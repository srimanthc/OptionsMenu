package com.example.optionsmenuexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}