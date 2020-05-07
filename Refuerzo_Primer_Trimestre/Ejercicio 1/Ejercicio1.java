package com.agilg00;

import java.util.Scanner;

public class Ejercicio1 {

    /*Enunciado
    Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:

      1
     121
    12321
   1234321

     */


    public static void main(String[] args) {

        //Variables
        int altura;
        int numero=1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce la altura de la pirámide, que deberá ser un número positivo y entero");

            altura = sc.nextInt();

        } while (altura < 0);
        int espacios=altura-1;

        //Bucle para los espacios en blanco

        for (int i = 1; i <=altura; i++) {
            int contador=0;
            for(int j=1;j<=espacios;j++) {
                System.out.print(" ");
            }
            //bucle para imprimir los numeros
            for(int j =1;j<=numero;j++) {

                //Incremento
                if(j<=i) {
                    contador=contador+1;
                }
                else {
                    contador=contador-1;
                }
                System.out.print(contador);
            }
            System.out.println();
            numero=numero+2;
            espacios=espacios-1;
        }


    }
}
