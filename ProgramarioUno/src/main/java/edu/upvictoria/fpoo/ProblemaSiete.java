package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaSiete {
        public static void main(String[] args) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            double Litro = 0;
            double Galon_Litro = 1 / 3.785;
            double PrecioGalon = 0;
            double Pago = 0;

            try {
                System.out.println("Ingrese la cantidad de Litros:");
                Litro = Double.parseDouble(bf.readLine());

                double galones = Litro * Galon_Litro;

                System.out.println("Ingrese el precio por galón:");
                PrecioGalon= Double.parseDouble(bf.readLine());

                Pago = galones * PrecioGalon;
                System.out.println("El pago total es:$" + Pago);

            } catch (IOException | NumberFormatException e) {
                System.out.println();
                return;
            }
        }
}
