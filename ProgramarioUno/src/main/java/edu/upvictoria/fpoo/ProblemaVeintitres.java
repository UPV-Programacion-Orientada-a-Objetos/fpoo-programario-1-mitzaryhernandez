package edu.upvictoria.fpoo;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaVeintitres {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double precioOriginal = 0;
        double descuento = 0.20;
        double iva = 0.15;
        double precioDescuento;
        double precioFinal;

        try {

            System.out.println("----------------PRECIO DE ARTICULO-------------------");

            System.out.println("Ingrese el precio del articulo:");
            precioOriginal = Double.parseDouble(bf.readLine());

            precioDescuento = precioOriginal * (1 - descuento);

            precioFinal = precioDescuento * (1 + iva);

            System.out.println("Precio con descuento: $" + precioDescuento);
            System.out.println("Precio final con IVA: $" + precioFinal);

        } catch (IOException | NumberFormatException e) {
            System.out.println();
            return;
        }
    }
}
