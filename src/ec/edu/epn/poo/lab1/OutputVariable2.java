package ec.edu.epn.poo.lab1;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class OutputVariable2 {

    public static void main(String[] args) {

        // Declaracion de variables
        long numero = 123098;
        double pi = Math.PI;
        String status = "";
        int grade = 8;

        // Impresion de numeros enteros
        System.out.printf("%d %n", numero);
        System.out.printf("%08d %n", numero);
        System.out.printf("%+d %n", numero);

        // Configuracion regional de Estados Unidos
        Locale.setDefault(Locale.US);

        // Formato de numero con separador de miles
        DecimalFormat formato1 =
                new DecimalFormat("###,###.##");

        String valorFormateado1 = formato1.format(numero);

        System.out.printf("%s %n", valorFormateado1);

        // Impresion del numero PI con diferentes formatos
        System.out.printf("%.6f %n", pi);
        System.out.printf("%.3f %n", pi);
        System.out.printf("%8.3f %n", pi);
        System.out.printf("%.4f %n", pi);

        // Formato decimal con coma
        DecimalFormatSymbols simbolos =
                new DecimalFormatSymbols(Locale.GERMANY);

        DecimalFormat formato2 =
                new DecimalFormat("0.0000", simbolos);

        System.out.println(formato2.format(pi));

        // Manejo del operador condicional
        System.out.println("Manejo de operador condicional");

        // Obtener el estado del estudiante
        status = (grade >= 7) ? "Passed" : "Fail";

        // Imprimir el estado
        System.out.println(status);

        // Leer status desde el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el estado del estudiante: ");

        status = entrada.nextLine();

        System.out.println("Estado ingresado: " + status);

        entrada.close();
    }
}