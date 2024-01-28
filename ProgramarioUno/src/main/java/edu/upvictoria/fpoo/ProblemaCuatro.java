package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaCuatro {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Pi = 3.1416;
        double Radio = 0;
        try {

            System.out.println("------------------AREA DEL CIRCULO---------------------");
            System.out.println("Ingresa el valor de Radio");
            Radio = Double.parseDouble(bf.readLine());

        }catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
        System.out.println("EL AREA DEL CIRCULO ES: " + (Pi* Radio*Radio));
    }
}

