package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaOnce {
    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double MetrosCubicos = 0;
        double PrecioMetroCubico = 0;
        double TotalPagar = 0;

        try {
            System.out.println("------------------AGUA--------------------");
            System.out.println("Ingrese la cantidad de metros cúbicos de agua:");
            MetrosCubicos = Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el precio por metro cúbico de agua:");
            PrecioMetroCubico = Double.parseDouble(bf.readLine());

            TotalPagar = MetrosCubicos * PrecioMetroCubico;

            System.out.println("El total a pagar por " + MetrosCubicos + " metros cúbicos de agua consumidos es: " + TotalPagar);
        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
    }
}
