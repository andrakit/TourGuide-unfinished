package com.example.andraburuiana.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class list_of_museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_museums);
    }

    public void openMuseums(View view) {
        Intent i = new Intent(this, Museums.class);
        startActivity(i);


    }
}