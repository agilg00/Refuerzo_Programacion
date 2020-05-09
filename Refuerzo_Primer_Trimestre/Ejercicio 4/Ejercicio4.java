package com.agilg00;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de la X");

        altura = sc.nextInt();
        //bucle para generar la X

        for (int i = 0; i <=altura ; i++) {
            for (int j = 0; j <=altura ; j++) {

                if (i-j ==0 || i+j ==altura){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}
