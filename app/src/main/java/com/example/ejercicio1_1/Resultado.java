package com.example.ejercicio1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        double valor = getIntent().getExtras().getDouble("resultado");

        calculadora calc = new calculadora(valor);

        res = findViewById(R.id.textView4);
        res.setText(""+calc.getResultado());

    }



}