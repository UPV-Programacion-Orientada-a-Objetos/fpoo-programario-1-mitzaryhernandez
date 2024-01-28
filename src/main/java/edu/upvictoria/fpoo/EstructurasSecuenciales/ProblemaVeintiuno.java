package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ProblemaVeintiuno {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Metros = 0;
        double Costo= 0;
        double CostoT = 0;

        try {

            System.out.println("------------------CONSUMO DE AGUA---------------------");
            System.out.println("Ingrese los metros de agua consumida: ");
            Metros = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el costo de agua: ");
            Costo= Double.parseDouble(bf.readLine());

            CostoT = Metros * Costo;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El costo total de agua consumida es: $" + CostoT);
    }
}

