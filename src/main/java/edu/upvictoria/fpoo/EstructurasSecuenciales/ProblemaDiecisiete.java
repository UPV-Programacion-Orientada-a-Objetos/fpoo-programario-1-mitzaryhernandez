package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDiecisiete {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double CatetoA = 0;
        double CatetoB = 0;
        double Hipotenusa = 0;

        try {

            System.out.println("-----------------HIPOTENUSA------------------");
            System.out.println("Ingresa el valor del CatetoA:");
            CatetoA = Double.parseDouble(bf.readLine());

            System.out.println("Ingresa el valor del CatetoB:");
            CatetoB = Double.parseDouble(bf.readLine());

            Hipotenusa = Math.sqrt(CatetoA * CatetoA + CatetoB * CatetoB);

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
        System.out.println("La Hipotenusa total es: " + Hipotenusa);
    }
}
