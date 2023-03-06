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

public class weight extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        EditText e01,e02;
        Button btn;
        Spinner sp01;
        Spinner sp02;

        e01=findViewById(R.id.val3);
        e02=findViewById(R.id.ans1);
        btn=findViewById(R.id.butt);
        sp01=findViewById(R.id.spinner3);
        sp02=findViewById(R.id.spinner4);

        String[] from= {"GRAM","KG","MG"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp01.setAdapter(ad1);

        String[] To= {"KG","GRAM","MG"};
        ArrayAdapter ad2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,To);
        sp02.setAdapter(ad2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double ans;
                Double val=Double.parseDouble(e01.getText().toString());
                if(sp01.getSelectedItem().toString()=="GRAM" && sp02.getSelectedItem().toString()=="GRAM"){
                    ans=val;
                    e02.setText(ans.toString()+" Gram");
                }
                if(sp01.getSelectedItem().toString()=="GRAM" && sp02.getSelectedItem().toString()=="KG"){
                    ans=val/1000;
                    e02.setText(ans.toString()+" Kg");
                }
                if(sp01.getSelectedItem().toString()=="GRAM" && sp02.getSelectedItem().toString()=="MG"){
                    ans=val*1000;
                    e02.setText(ans.toString()+" Mg");
                }

                if(sp01.getSelectedItem().toString()=="KG" && sp02.getSelectedItem().toString()=="GRAM"){
                    ans=val*1000;
                    e02.setText(ans.toString()+" Gram");
                }
                if(sp01.getSelectedItem().toString()=="KG" && sp02.getSelectedItem().toString()=="KG"){
                    ans=val;
                    e02.setText(ans.toString()+" Kg");
                }
                if(sp01.getSelectedItem().toString()=="KG" && sp02.getSelectedItem().toString()=="MG"){
                    ans=val*1000000;
                    e02.setText(ans.toString()+" Mg");
                }
                if(sp01.getSelectedItem().toString()=="MG" && sp02.getSelectedItem().toString()=="GRAM"){
                    ans=val/1000;
                    e02.setText(ans.toString()+" Gram");
                }
                if(sp01.getSelectedItem().toString()=="MG" && sp02.getSelectedItem().toString()=="MG"){
                    ans=val;
                    e02.setText(ans.toString()+" Mg");
                }
                if(sp01.getSelectedItem().toString()=="MG" && sp02.getSelectedItem().toString()=="KG"){
                    ans=val/1000000;
                    e02.setText(ans.toString()+" Kg");
                }
            }
        });



    }
}