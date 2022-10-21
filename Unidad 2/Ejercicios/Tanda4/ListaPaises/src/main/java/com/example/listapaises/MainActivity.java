package com.example.listapaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner paisessp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paisessp = findViewById(R.id.paisessp);
        String[] datos = new String[] {"Italia", "Portugal", "España", "Francia", "Alemania", "Japón",
                "Chino", "Argentina"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        paisessp.setAdapter(adaptador);
        
        paisessp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}