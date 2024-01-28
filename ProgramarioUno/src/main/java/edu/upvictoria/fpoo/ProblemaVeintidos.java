package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ProblemaVeintidos {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Consumo = 0;
        double Costo= 0;
        double CostoT = 0;

        try {
            System.out.println("------------------CONSUMO DE LUZ---------------------");

            System.out.println("Ingrese el consumo de luz en KW: ");
            Consumo = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el costo de luz: ");
            Costo= Double.parseDouble(bf.readLine());

            CostoT = Consumo * Costo;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El costo total de luz consumida es: $" + CostoT);
    }
}

