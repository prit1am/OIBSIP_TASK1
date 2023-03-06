package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class temperture extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperture);

        EditText ed1,ed2;
        Button btn1;
        Spinner sp3,sp4;

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btn1=findViewById(R.id.bbtn);
        sp3=findViewById(R.id.spinner5);
        sp4=findViewById(R.id.spinner6);

        String []from={"Celsius","Fahrenheit"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp3.setAdapter(ad1);

        String []to={"Fahrenheit","Celsius"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp4.setAdapter(ad2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a;
                Double va=Double.parseDouble(ed1.getText().toString());

                if(sp3.getSelectedItem().toString()=="Celsius" && sp4.getSelectedItem().toString()=="Celsius"){
                    a=va;
                    ed2.setText(a.toString()+" Celsius");
                }
                if(sp3.getSelectedItem().toString()=="Celsius" && sp4.getSelectedItem().toString()=="Fahrenheit"){
                    a=(va*(9/5.0))+32;
                    ed2.setText(a.toString()+" Fahrenheit");
                }
                if(sp3.getSelectedItem().toString()=="Fahrenheit" && sp4.getSelectedItem().toString()=="Fahrenheit"){
                    a=va;
                    ed2.setText(a.toString()+" Fahrenheit");
                }

                if(sp3.getSelectedItem().toString()=="Fahrenheit" && sp4.getSelectedItem().toString()=="Celsius"){
                    a=(va-32)*(5/9.0);
                    ed2.setText(a.toString()+" Celsius");
                }
            }
        });



    }
}