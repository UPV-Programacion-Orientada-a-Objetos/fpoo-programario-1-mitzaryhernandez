package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaTrece {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Peso = 0;
        double Dolar = 20;
        double dolares = 0; // Mover la declaración aquí

        try {

            System.out.println("-----------------CONVERSION DE PESO A DOLAR-------------------");
            System.out.println("Ingresa la cantidad de pesos mexicanos:");
            Peso = Double.parseDouble(bf.readLine());

            dolares = Peso / Dolar;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
        System.out.println("La cantidad de dólares que puede adquirir es:" + dolares);
    }
}
