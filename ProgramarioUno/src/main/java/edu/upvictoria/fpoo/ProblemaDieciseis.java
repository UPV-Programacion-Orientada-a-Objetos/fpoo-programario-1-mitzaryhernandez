package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDieciseis {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Precio= 0;
        double MetrosC= 0;
        double Total = 0;

        try {
            System.out.println("Ingrese el precio por metro cuadrado en dólares:");
            Precio = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el área en metros cuadrados:");
            MetrosC = Double.parseDouble(bf.readLine());

            Total = Precio * MetrosC;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El costo total es: $" + Total);
    }
}

