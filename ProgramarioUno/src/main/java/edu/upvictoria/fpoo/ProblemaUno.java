package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num1 = 0;
        int num2 = 0;

        try {

            System.out.println("------------------SUMA--------------------");
            System.out.println("Ingresa el valor 1:");
            num1 = Integer.parseInt(bf.readLine());

            System.out.println("Ingresa el valor 2:");
            num2 = Integer.parseInt(bf.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
        System.out.println("LA SUMA TOTAL ES: " + (num1 + num2));
    }
}
