package com.example.andraburuiana.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView txt = (TextView) findViewById(R.id.txt);{
    txt.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent txtIntent = new Intent(MainActivity.this, list_of_restaurants.class);
            startActivity(txtIntent);
        }
    });}
}






