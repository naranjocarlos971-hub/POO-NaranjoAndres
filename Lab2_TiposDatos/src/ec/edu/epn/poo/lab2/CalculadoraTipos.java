package ec.edu.epn.poo.lab2;
 
import java.util.Locale;
//permite utilizar la clase Locale para configurar formatos regionales.
import java.util.Scanner;
//permite utilizar la clase Scanner para recibir datos desde el teclado.

 
public class CalculadoraTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un objeto llamado sc que permite leer los datos que introduzca el usuario mediante el teclado.
        //Scanner: clase que permite leer datos.
        //sc: nombre de la variable.
        //new: crea un objeto.
        //System.in: indica que los datos provienen de la entrada estándar, normalmente el teclado.
        sc.useLocale(Locale.US);             // punto decimal
        //Configura el objeto Scanner para interpretar números decimales utilizando el formato de Estados Unidos.
        
 
        System.out.print("Ingrese un entero a: ");//Ingrese un entero a: 300
        int a = sc.nextInt();
        System.out.print("Ingrese un entero b (distinto de 0): "); //Ingrese un entero b (distinto de 0): 7
        int b = sc.nextInt();
        System.out.print("Ingrese un número real x: ");//Ingrese un número real x: 258.75
        double x = sc.nextDouble();
        sc.nextLine();          // consume el Enter pendiente
        System.out.print("Ingrese un número como texto: ");//Ingrese un número como texto: 41
        String texto = sc.nextLine();
 
        System.out.println("\n=== Operaciones con enteros ===");
        System.out.println("a + b           = " + (a + b));
        System.out.println("a / b (entera)  = " + (a / b));
        System.out.println("a % b (resto)   = " + (a % b));
        System.out.println("a / b (real)    = " + ((double) a / b));
        System.out.println("a * b (long)    = " + ((long) a * b));
 
        
        System.out.println("\n=== Conversiones de x ===");
        System.out.println("(int) x         = " + (int) x);
        System.out.println("Math.round(x)   = " + Math.round(x));
        //Math.round() permite redondear un número al entero más cercano.
        System.out.println("(byte) x        = " + (byte) x);
        System.out.println("(float) x       = " + (float) x);
 
        
        System.out.println("\n=== Otros tipos ===");
        System.out.println("(char) a        = " + (char) a);
        System.out.println("(byte) a        = " + (byte) a);
        int desdeTexto = Integer.parseInt(texto.strip());
        //strip() elimina los espacios en blanco que se encuentran al principio y al final de una cadena.
        //Integer.parseInt()
        //Este método convierte una cadena de texto que representa un número entero en un valor de tipo int.
        System.out.println("texto + 1       = " + (desdeTexto + 1));
        System.out.println("texto concatenado con 1 = " + texto + 1);
 
        sc.close();
        //Como ya terminamos de ingresar y procesar todos los datos, cerramos el objeto Scanner
    }
}
