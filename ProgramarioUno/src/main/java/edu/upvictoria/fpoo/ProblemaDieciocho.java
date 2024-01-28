package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDieciocho {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Distancia = 0;
        double Costo= 0;
        double Total = 0;

        try {

            System.out.println("------------------COSTO BOLETO--------------------");
            System.out.println("Ingrese la distancia: ");
            Distancia = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el costo: ");
            Costo = Double.parseDouble(bf.readLine());

            Total = Distancia * Costo;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El costo total del boleto es: $" + Total);
    }
}

