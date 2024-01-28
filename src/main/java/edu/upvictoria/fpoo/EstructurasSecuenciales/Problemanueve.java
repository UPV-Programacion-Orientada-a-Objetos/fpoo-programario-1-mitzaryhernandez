package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Problemanueve {

    public static void execute() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double HorasTrabajadas = 0;
        double PagoHora = 0;
        double SueldoSemana = 0;

        try{

            System.out.println("-------------------SUELDO SEMANAL--------------------");
            System.out.println("Ingresa la cantidad de horas trabajadas:");
            HorasTrabajadas=Double.parseDouble(bf.readLine());

            System.out.println("Ingrese el pago por hora:");
            PagoHora=Double.parseDouble(bf.readLine());

            SueldoSemana=HorasTrabajadas*PagoHora;

            System.out.println("El sueldo semanal es: $" + SueldoSemana);

    } catch (IOException | NumberFormatException e) {
        System.out.println();
        return;
       }
    }
}
