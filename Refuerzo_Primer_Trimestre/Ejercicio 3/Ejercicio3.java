package com.agilg00;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura de la U");
        altura = sc.nextInt();

        for (int i = 1; i <=altura-1  ; i++) {
            for (int j = 1; j <=altura ; j++) {
                if (j==1 || j==altura || i==altura-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();


        }





    }
}
