package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.net.Inet4Address;

public class MainActivity2 extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LinearLayout layout1;
        layout1=findViewById(R.id.length);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,length.class);
                startActivity(i);
            }
        });
        LinearLayout layout2;
        layout2=findViewById(R.id.weight);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,weight.class);
                startActivity(i);
            }
        });
        LinearLayout layout3;
        layout3= findViewById(R.id.temp);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,temperture.class);
                startActivity(i);

            }
        });













    }
}