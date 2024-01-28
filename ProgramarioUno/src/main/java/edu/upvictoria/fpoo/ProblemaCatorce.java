package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class ProblemaCatorce {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int AñoNaci = 0;

        try {

            System.out.println("------------------EDAD--------------------");
            System.out.println("Ingresa el año de nacimiento:");
            AñoNaci = Integer.parseInt(bf.readLine());

            int AñoAct= Calendar.getInstance().get(Calendar.YEAR);

            int edad = AñoAct - AñoNaci;

            System.out.println("La edad es: " + edad);

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
    }
}
