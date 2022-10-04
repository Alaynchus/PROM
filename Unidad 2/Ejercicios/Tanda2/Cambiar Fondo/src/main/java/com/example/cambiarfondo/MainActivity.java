package com.example.cambiarfondo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    private Button encenderbtn;
    private Button apagarbtn;
    private LinearLayout linearLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encenderbtn = (Button) findViewById(R.id.encenderbtn);
        apagarbtn = (Button) findViewById(R.id.apagarbtn);
        linearLayout = (LinearLayout) findViewById(R.id.linearLay);

        encenderbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                linearLayout.setBackgroundColor(Color.GREEN);
            }
        });
        apagarbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                linearLayout.setBackgroundColor(Color.RED);
            }
        });
    }
}