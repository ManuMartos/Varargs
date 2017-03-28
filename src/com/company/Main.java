package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        System.out.println(suma(1,2,3,4));

        int nums[] = {345,675,945};

        System.out.println("Ejercicio 2");
        System.out.println(mcd(nums));
    }

    public static int suma(int...values){

        int resultado = 0;

        for (int num: values){
            resultado += num;
        }

        return resultado;
    }

    public static int mcd(int...numero){

        int resto = 0;

        for (int i = 0; i < numero.length - 1; i++){
            resto = maximoComunDivisor(numero[i], numero[i+1]);

            numero[i + 1] = resto;

        }

        return resto;
    }

    public static int maximoComunDivisor(int a, int b){

        int res;

        while (a > 0){
            res = a;
            a = b % a;
            b = res;
        }

        return b;
    }
}
