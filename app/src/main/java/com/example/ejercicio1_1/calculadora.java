package com.example.ejercicio1_1;

import java.text.DecimalFormat;

public class calculadora {
    double resultado;

    public calculadora(){
        this.resultado = 0;
    }

    public calculadora(double resultado){
        this.resultado = resultado;
    }

    public void suma(int num1, int num2){
        this.resultado = num1+num2;
    }

    public void resta(int num1, int num2){
        this.resultado = num1-num2;
    }

    public void mult(int num1, int num2){
        this.resultado = num1*num2;
    }

    public void div(int num1, int num2){
        double res_div = 0;
        try {
            res_div = num1/num2;
        }catch (Exception e){
            this.resultado = 0;
        }
        this.resultado = res_div;
    }

    public double getResultado() {
        return resultado;
    }
}
