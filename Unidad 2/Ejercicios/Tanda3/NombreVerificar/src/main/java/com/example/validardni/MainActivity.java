package com.example.validardni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText numDNItxt;
    private EditText letraDNItxt;
    private TextView result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numDNItxt = (EditText) findViewById(R.id.numDNItxt);
        letraDNItxt = (EditText) findViewById(R.id.letraDNItxt);
        result = (TextView) findViewById(R.id.result);
    }

    public void validar(View view) {
        try {
            int numeroDNI = Integer.parseInt(numDNItxt.getText().toString());
            if(numeroDNI < 10000000 || numeroDNI > 99999999)
                throw new Exception("El número de DNI no es válido");

            String letraAComprobar = letraDNItxt.getText().toString();
            String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

            int resto = numeroDNI%23;
            String letraCorrecta = letras[resto];

            if(letraAComprobar.equals(letraCorrecta))
                result.setText("La letra es CORRECTA");
            else
                result.setText("La letra es INCORRECTA");
        }
        catch(NumberFormatException e) {
            result.setText("El valor introducido como DNI no es númerico");
        }
        catch (Exception e) {
            result.setText(e.getMessage());
        }
    }
}