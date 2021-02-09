package com.example.schoolhulpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PtaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pta);


        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdepter = new ArrayAdapter<String>(PtaActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Pta));
        myAdepter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdepter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1){
                    startActivity(new Intent(PtaActivity.this, MainActivity.class));
                }else if (i == 2){
                    startActivity(new Intent(PtaActivity.this, RoosterActivity.class));
                }else if (i == 3){
                    startActivity(new Intent(PtaActivity.this, BestandenActivity.class));
                }else if (i == 4){
                    startActivity(new Intent(PtaActivity.this, LeertipsActivity.class));
                }else if (i == 5){
                    startActivity(new Intent(PtaActivity.this, LeervideosActivity.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        })  ;
    }
}