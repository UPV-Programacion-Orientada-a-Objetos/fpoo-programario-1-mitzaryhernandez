package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDiecinueve{
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Distancia = 0;
            double Velocidad= 0;
            double Tiempo = 0;

            try {

                System.out.println("-----------------TIEMPO DEL VIAJE--------------------");
                System.out.println("Ingrese la distancia: ");
                Distancia = Double.parseDouble(bf.readLine());

                System.out.println("Ingrese la velocidad: ");
                Velocidad= Double.parseDouble(bf.readLine());

                Tiempo = Distancia / Velocidad;

            } catch (IOException | NumberFormatException e) {
                System.out.println();
                return;
            }

            System.out.println("El tiempo del viaje es: " + Tiempo + " horas");
        }
}
