package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class length extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        EditText e1,e2;
        Button b1;
        Spinner sp1;
        Spinner sp2;

        e1= findViewById(R.id.val1);
        b1=findViewById(R.id.button);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        e2=findViewById(R.id.ans);

        String[] from= {"METER","KM","CM"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String[] to={"KM","METER","CM"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double ans;
                Double value=Double.parseDouble(e1.getText().toString());

                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="METER"){

                    ans=value;

                    e2.setText(ans.toString()+" Meter");
                }
                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="KM"){
                    ans=value/1000;

                    e2.setText(ans.toString()+" Km");
                }
                if(sp1.getSelectedItem().toString()=="METER"&&sp2.getSelectedItem().toString()=="CM"){
                    ans=value*100;

                    e2.setText(ans.toString()+" Cm");
                }
                if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="METER"){
                    ans=value*1000;

                    e2.setText(ans.toString()+" Meter");
                }
                if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="KM"){
                    ans=value;

                    e2.setText(ans.toString()+" Km");
                }
                if(sp1.getSelectedItem().toString()=="KM"&&sp2.getSelectedItem().toString()=="CM"){
                    ans=value*100000;

                    e2.setText(ans.toString()+" Cm");
                }
                if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="METER"){
                    ans=value/1000;

                    e2.setText(ans.toString()+" Meter");
                }
                if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="CM"){
                    ans=value;

                    e2.setText(ans.toString()+" Cm");
                }
                if(sp1.getSelectedItem().toString()=="CM"&&sp2.getSelectedItem().toString()=="KM"){
                    ans=value/100000;

                    e2.setText(ans.toString()+" Meter");
                }


            }
        });




    }
}