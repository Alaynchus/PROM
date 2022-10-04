package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText primerValor;
    private EditText segundoValor;
    private TextView resultado;
    private Button sumabtn;
    private Button restabtn;
    private Button multbtn;
    private Button divisionbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primerValor = findViewById(R.id.primerValor);
        segundoValor = findViewById(R.id.segundoValor);
        resultado = findViewById(R.id.resultado);
        sumabtn = findViewById(R.id.sumabtn);
        restabtn = findViewById(R.id.restabtn);
        multbtn = findViewById(R.id.multbtn);
        divisionbtn = findViewById(R.id.divisionbtn);


    }

    public void operar(View view) {
        try{
            int n1 = Integer.parseInt(primerValor.getText().toString());
            int n2 = Integer.parseInt(segundoValor.getText().toString());

            if(sumabtn.isPressed()){
                resultado.setText("Resultado:\t"+(n1+n2));
            }
            else if(restabtn.isPressed()){
                resultado.setText("Resultado:\t"+(n1-n2));
            }
            else if(multbtn.isPressed()){
                resultado.setText("Resultado:\t"+(n1*n2));
            }
            else{
                resultado.setText("Resultado:\t"+(n1/n2));
            }
        }
        catch(NumberFormatException e){
            resultado.setText("Resultado: Se han introcido valores de un tipo incorrecto.");
        }
        catch(Exception e){
            resultado.setText("Resultado: Operación matemática no permitida.");
        }
    }
}