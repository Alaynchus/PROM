package com.example.calculadorajuego;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText   resultadotxt;
    private TextView numCorrectas, numIncorrectas, num1, num2;
    private int nu1, nu2, nuCorrectas, nuIncorrectas;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.numero1txt);
        num2 = findViewById(R.id.numero2txt);
        numCorrectas = findViewById(R.id.correctaslbl);
        numIncorrectas = findViewById(R.id.incorrectaslbl);
        resultadotxt = findViewById(R.id.resultadotxt);
        nu1=0;
        nu2=0;
        nuCorrectas=0;
        nuIncorrectas=0;
        crearNumerosRandom();
    }
    private void crearNumerosRandom(){

        nu1=(int)(Math.random()*100);
        num1.setText(String.valueOf(nu1));
        nu2=(int)(Math.random()*100);
        num2.setText(String.valueOf(nu2));


    }
    public void comprobarListenerBtn(View view) {
        try {
            int resulcom = Integer.parseInt(resultadotxt.getText().toString());
            Intent intent = new Intent(MainActivity.this, ResultadoOperacionActivity.class);
            intent.putExtra("nu1",nu1);
            intent.putExtra("nu2",nu2);
            intent.putExtra("resulcom",resulcom);
            startActivityForResult(intent,2);
        }
        catch(NumberFormatException e) {
            //no es numeríco
        }
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2 && resultCode==RESULT_OK){
            crearNumerosRandom();
            resultadotxt.setText("");

            boolean respuesta = data.getExtras().getBoolean("esCorrecta");
            if(respuesta){
                nuCorrectas++;
            }
            else{
                nuIncorrectas++;
            }
            numCorrectas.setText(nuCorrectas+"");
            numIncorrectas.setText(nuIncorrectas+"");
        }
    }
}