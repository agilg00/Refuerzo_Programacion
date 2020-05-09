package com.agilg00;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        Enunciado
        Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
        Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
        Usa long en lugar de int donde sea necesario para admitir números largos.

        Ejemplo 1: Por favor, introduzca un número entero positivo: 94026782 Dígitos pares: 4 0 2 6 8 2 Suma de los dígitos pares: 22

        Ejemplo 2: Por favor, introduzca un número entero positivo: 31779 Dígitos pares: Suma de los dígitos pares: 0

        Ejemplo 3: Por favor, introduzca un número entero positivo: 2404 Dígitos pares: 2 4 0 4 Suma de los dígitos pares: 10
         */

        long num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo:");

        do {

            num = sc.nextLong();
            if (num<0){
                System.out.println("Error, introduce el número correcto");
            }


        }while (num<0);

        long aux = num;
        int contador=0;
        while (aux > 0) {
            aux /= 10;
            contador++;
        }

        System.out.println(contador);

    }

}

