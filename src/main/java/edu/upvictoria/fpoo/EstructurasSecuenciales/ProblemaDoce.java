package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDoce {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        double Base = 0;
        double Altura = 0;
        try {

            System.out.println("------------------AREA DE TRIANGULO--------------------");
            System.out.println("Ingresa el valor de la Base:");
            Base = Double.parseDouble(bf.readLine());

            System.out.println("Ingresa el valor de la altura:");
            Altura = Double.parseDouble(bf.readLine());
        }catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
        System.out.println("EL AREA DEL TRIANGULO ES: " + (Base * Altura)/2);
    }
}
