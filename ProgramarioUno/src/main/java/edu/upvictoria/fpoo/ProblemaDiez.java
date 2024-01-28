package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDiez {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double Metros = 0;
        double PulgadasMetros = 1 / 0.0254;
        double Pulgadas = 0;

        try {
            System.out.println("------------------CANTIDAD DE TELA--------------------");
            System.out.println("Ingrese la cantidad de metros:");
            Metros = Double.parseDouble(bf.readLine());

            Pulgadas = Metros * PulgadasMetros;

            System.out.println("La cantidad de pulgadas de tela requeridas es: " + Pulgadas + " pulgadas");

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
    }
}
