package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class App {

    public void printMenu() {
        System.out.println("------------------Seleccione una opción------------------");
        System.out.println("1. Suma de dos números");
        System.out.println("2. Cálculo de promedios");
        System.out.println("3. Área de un rectángulo");
        System.out.println("4. Área de una circunferencia");
        System.out.println("5. Área de un terreno");
        System.out.println("6. Área de la figura");
        System.out.println("7. Producción de leche");
        System.out.println("8. Distancia entre dos puntos");
        System.out.println("9. Sueldo semanal ");
        System.out.println("10. Modista");
        System.out.println("11. Conagua");
        System.out.println("12. Área de un triángulo");
        System.out.println("13. Conversiones de peso a dolar");
        System.out.println("14. Edad del personal");
        System.out.println("15. Estacionamiento");
        System.out.println("16. Pinturas");
        System.out.println("17. Hipotenusa");
        System.out.println("18. Autobuses");
        System.out.println("19. Tiempo en bicicleta");
        System.out.println("20. Costo de llamada telefónica");
        System.out.println("21. CONAGUA");
        System.out.println("22. Compañía de luz ");
        System.out.println("23. Descuento e IVA");
        System.out.println("24. Ahorro");
        System.out.println("25. Cheques");
        System.out.println("26. Concepto de monto");
        System.out.println("27. Salir");
    }

    public void printWelcome() {
        System.out.println("---------------Bienvenido al problemario uno---------------");
    }

    public void selectOpc() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int opc = 0;
            printMenu();
            try {
                String input = scanner.readLine();
                if (input.isEmpty()) {
                    System.out.println("Debe ingresar una opción.");
                    continue;
                }
                opc = Integer.parseInt(input);
            } catch (InputMismatchException | IOException e) {
                System.out.println("---------OPCIÓN NO VÁLIDA---------");
            }

            if (opc >= 0 && opc <= 27) {
                switch (opc) {
                    case 1:
                        ProblemaUno.execute();
                        break;
                    case 2:
                        ProblemaDos.execute();
                        break;
                    case 3:
                        ProblemaTres.execute();
                        break;
                    case 4:
                        ProblemaCuatro.execute();
                        break;
                    case 5:
                        ProblemaCinco.execute();
                        break;
                    case 6:
                        ProblemaSeis.execute();
                        break;
                    case 7:
                        ProblemaSiete.execute();
                        break;
                    case 8:
                        ProblemaOcho.execute();
                        break;
                    case 9:
                        Problemanueve.execute();
                        break;
                    case 10:
                        ProblemaDiez.execute();
                        break;
                    case 11:
                        ProblemaOnce.execute();
                        break;
                    case 12:
                        ProblemaDoce.execute();
                        break;
                    case 13:
                        ProblemaTrece.execute();
                        break;
                    case 14:
                        ProblemaCatorce.execute();
                        break;
                    case 15:
                        ProblemaQuince.execute();
                        break;
                    case 16:
                        ProblemaDieciseis.execute();
                        break;
                    case 17:
                        ProblemaDiecisiete.execute();
                        break;
                    case 18:
                        ProblemaDieciocho.execute();
                        break;
                    case 19:
                        ProblemaDiecinueve.execute();
                        break;
                    case 20:
                        ProblemaVeinte.execute();
                        break;
                    case 21:
                        ProblemaVeintiuno.execute();
                        break;
                    case 22:
                        ProblemaVeintidos.execute();
                        break;
                    case 23:
                        ProblemaVeintitres.execute();
                        break;
                    case 24:
                        ProblemaVeinticuatro.execute();
                        break;
                    case 25:
                        ProblemaVeinticinco.execute();
                        break;
                    case 26:
                        System.out.println();
                        break;
                    case 27:
                        return;
                }
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.printWelcome();
        app.selectOpc();
    }
}
