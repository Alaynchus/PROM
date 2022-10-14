package com.example.calculadorajuego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2, numCorrectas, numIncorrectas;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.numero1txt);
        num2 = findViewById(R.id.numero2txt);
        crearNumerosRandom();
    }
    private void crearNumerosRandom(){
        num1.setText(3+"");
        num2.setText(4+"");

    }
}