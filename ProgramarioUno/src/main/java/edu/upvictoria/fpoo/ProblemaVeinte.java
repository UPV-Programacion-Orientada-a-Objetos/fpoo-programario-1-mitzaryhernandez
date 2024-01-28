package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaVeinte {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Duracion= 0;
        double Costo= 0;
        double CostoT = 0;

        try {
            System.out.println("Ingrese la duración de la llamada: ");
            Duracion = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el costo de la llamada: ");
            Costo= Double.parseDouble(bf.readLine());

            CostoT = Duracion * Costo;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El costo total de la llamada es: $" + CostoT);
    }
}
