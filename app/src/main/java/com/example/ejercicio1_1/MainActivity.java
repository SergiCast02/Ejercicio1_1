package com.example.ejercicio1_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText caja1;
    private EditText caja2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora calcu = new calculadora();

        //Suma
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Obtener valor caja 1
                caja1 = (EditText) findViewById(R.id.editTextNumber);
                int num1 = 0;
                try {
                    num1 = Integer.parseInt(caja1.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                //Obtener valor caja 2
                caja2 = (EditText) findViewById(R.id.editTextNumber2);
                int num2 = 0;
                try {
                    num2 = Integer.parseInt(caja2.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                calcu.suma(num1, num2);
                Toast toast1 = Toast.makeText(getApplicationContext(),"Su resultado está listo!", Toast.LENGTH_SHORT);
                toast1.show();

                //Toast toast1 = Toast.makeText(getApplicationContext(),""+calcu.getResultado(), Toast.LENGTH_SHORT);
                //toast1.show();
            }
        });

        //Resta
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Obtener valor caja 1
                caja1 = (EditText) findViewById(R.id.editTextNumber);
                int num1 = 0;
                try {
                    num1 = Integer.parseInt(caja1.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                //Obtener valor caja 2
                caja2 = (EditText) findViewById(R.id.editTextNumber2);
                int num2 = 0;
                try {
                    num2 = Integer.parseInt(caja2.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                calcu.resta(num1,num2);
                Toast toast1 = Toast.makeText(getApplicationContext(),"Su resultado está listo!", Toast.LENGTH_SHORT);
                toast1.show();

                //Toast toast1 = Toast.makeText(getApplicationContext(),""+calcu.getResultado(), Toast.LENGTH_SHORT);
                //toast1.show();
            }
        });

        //Multiplicación
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Obtener valor caja 1
                caja1 = (EditText) findViewById(R.id.editTextNumber);
                int num1 = 0;
                try {
                    num1 = Integer.parseInt(caja1.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                //Obtener valor caja 2
                caja2 = (EditText) findViewById(R.id.editTextNumber2);
                int num2 = 0;
                try {
                    num2 = Integer.parseInt(caja2.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                calcu.mult(num1,num2);
                Toast toast1 = Toast.makeText(getApplicationContext(),"Su resultado está listo!", Toast.LENGTH_SHORT);
                toast1.show();
                //Toast toast1 = Toast.makeText(getApplicationContext(),""+calcu.getResultado(), Toast.LENGTH_SHORT);
                //toast1.show();
            }
        });

        //División
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Obtener valor caja 1
                caja1 = (EditText) findViewById(R.id.editTextNumber);
                int num1 = 0;
                try {
                    num1 = Integer.parseInt(caja1.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                //Obtener valor caja 2
                caja2 = (EditText) findViewById(R.id.editTextNumber2);
                int num2 = 0;
                try {
                    num2 = Integer.parseInt(caja2.getText().toString());
                } catch(NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

                calcu.div(num1,num2);
                Toast toast1 = Toast.makeText(getApplicationContext(),"Su resultado está listo!", Toast.LENGTH_SHORT);
                toast1.show();

                //Toast toast1 = Toast.makeText(getApplicationContext(),""+calcu.getResultado(), Toast.LENGTH_SHORT);
                //toast1.show();
            }
        });

        //Ver la otra Ventana
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double r = calcu.getResultado();
                goResultados(r);
            }
        });

    }

    public void goResultados(double r){
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("resultado", r);
        startActivity(i);


    }

}