package ec.edu.epn.poo.lab1;

import java.text.*; //clases para trabajar con formatos de texto y números
import java.util.Locale; //configuraciones regionales para representar números
import java.util.Scanner; //lectura de información desde el teclado

public class OutputVariable {

	public OutputVariable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numero = 123098; //almacenar numero entero
		double pi = Math.PI; 
		String status = "";
		int grade = 8;
		
		System.out.printf("%d %n",numero);
		// %d --> imprime un numero entero
		System.out.printf("%08d %n",numero);
		// %08 --> imprime el entero con ocho posiciones, rellenando con ceros a la izquierda
		System.out.printf("%+d %n", numero);
		// %+d --> imprime el signo positivo o negativo
		System.out.printf("%d %n", -Math.abs(numero));
		// imprime el numero en negativo
		Locale.setDefault(Locale.US);
		// Locale.US: establece la configuración regional de Estados Unidos
		DecimalFormat formato1 = new DecimalFormat("###,###.##");
		// DecimalFormat: permite definir cómo se representan los números
		String valorFormateado1 = formato1.format(numero);
		System.out.printf("%s %n",valorFormateado1);
		// 
		
		
		System.out.println("Manejo de operador condicional");
		
		status = (grade >= 7) ? "Passed" : "Fail";
		
		System.out.println(status);
	}

}
