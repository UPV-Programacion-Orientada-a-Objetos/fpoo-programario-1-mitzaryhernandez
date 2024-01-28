package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaQuince {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Tarifa = 15.00;
        double Horas = 0;
        double Total = 0;

        try {
            System.out.println("Ingrese la cantidad de horas: ");
            Horas = Double.parseDouble(bf.readLine());

            int HorasRedondeadas = (int) Math.ceil(Horas);

            Total = HorasRedondeadas * Tarifa;

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        System.out.println("El precio total es: $" + Total);
    }
}
