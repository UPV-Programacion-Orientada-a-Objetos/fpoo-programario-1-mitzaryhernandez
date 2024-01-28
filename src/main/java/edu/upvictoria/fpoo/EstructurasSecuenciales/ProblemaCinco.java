package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaCinco {

    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Base = 0;
        double Altura = 0;
        double Base1 = 0;
        double Altura1 = 0;
        double Area1 = 0;
        double Area2 = 0;

        try {

            System.out.println("------------------AREA DE LA FIGURA-------------------");
            System.out.println("Ingresa la base del triángulo:");
            Base = Double.parseDouble(bf.readLine());

            System.out.println("Ingresa la altura del triángulo:");
            Altura = Double.parseDouble(bf.readLine());

            Area1 = (Base * Altura) / 2;
            System.out.println("El área del triángulo es: " + Area1);

            System.out.println("Ingresa la base del rectángulo:");
            Base1 = Double.parseDouble(bf.readLine());

            System.out.println("Ingresa la altura del rectángulo:");
            Altura1 = Double.parseDouble(bf.readLine());

            Area2 = Base1 * Altura1;
            System.out.println("El área del rectángulo es: " + Area2);

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }

        double AreaTotal = Area1 + Area2;
        System.out.println("El área total es: " + AreaTotal);
    }
}
