package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaVeinticuatro {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Sueldo = 0;
        double Ahorro = 0.15;
        int Mes = 4;
        int Anio = 12;
        double Semana;
        double Mensual;
        double Anual;

        try {

            System.out.println("--------------------AHORRO-------------------------");
            System.out.println("Ingrese el sueldo:");
            Sueldo = Double.parseDouble(bf.readLine());

            Semana = Sueldo * Ahorro;

            Mensual = Semana * Mes;

            Anual = Mensual * Anio;

            System.out.println("El ahorro anual es: $" + Anual);

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
    }
}
