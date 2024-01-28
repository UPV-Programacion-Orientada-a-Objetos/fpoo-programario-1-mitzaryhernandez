package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos {

    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Cal1 = 0;
        double Cal2 = 0;
        double Cal3 = 0;
        double Cal4 = 0;
        try {

            System.out.println("------------------CALIFICACION--------------------");
            System.out.println("CALIFICACION 1:");
            Cal1 = Double.parseDouble(bf.readLine());

            System.out.println("CALIFICACION 2:");
            Cal2 = Double.parseDouble(bf.readLine());

            System.out.println("CALIFICACION 3:");
            Cal3 = Double.parseDouble(bf.readLine());

            System.out.println("CALIFICACION4:");
            Cal4 = Double.parseDouble(bf.readLine());

        } catch (IOException | NumberFormatException e) {
            return;
        }

        System.out.println("CALIFICACION FINAL: " + (Cal1 + Cal2 + Cal3 + Cal4 )/4);

    }
}
