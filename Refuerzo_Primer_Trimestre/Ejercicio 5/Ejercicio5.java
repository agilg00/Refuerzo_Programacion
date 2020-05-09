package com.agilg00;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número:");
        num = sc.nextInt();


        for (int i = 1; i <6; i++) {
            if (num%i==0){
                System.out.println(num + " Es primo");
            }else {
                System.out.println(num + " No es primo");
            }

        }



    }
}
