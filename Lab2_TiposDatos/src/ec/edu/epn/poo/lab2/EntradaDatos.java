package ec.edu.epn.poo.lab2;
 
import java.util.Locale;
//Esta clase permite trabajar con configuraciones regionales, como el idioma, 
//el país y los formatos numéricos.
import java.util.Scanner;
//Importa la clase Scanner, que permite leer información introducida por el usuario.
 


public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Scanner	Clase que permite leer datos.
        sc	Nombre de la variable que referencia al objeto.
        new	Crea un nuevo objeto.
        Scanner()	Constructor de la clase Scanner.
        System.in	Indica que los datos se reciben desde la entrada estándar, normalmente el teclado.
        Estamos creando un objeto llamado sc que nos permitirá leer lo que escriba 
        el usuario en la consola.
        */
        
        
 
        // 1. La trampa del Enter pendiente
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        //Usar esta instruccion para consumirel enter
        //sc.nextLine(); // Consumir el Enter pendiente
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();     // ¿qué lee aquí?
        System.out.println("edad = " + edad + ", nombre = [" + nombre + "]");
 
        // 2. Solución: consumir el Enter antes de leer la línea
        System.out.print("Nombre completo (otra vez): ");
        nombre = sc.nextLine();
        System.out.println("nombre = [" + nombre + "]");
 
        // 3. Locale: ¿punto o coma decimal?
        System.out.println("Locale del sistema: " + Locale.getDefault());
        sc.useLocale(Locale.US);           // el punto será el separador
        //indica que el objeto Scanner utilizará la configuración regional de Estados Unidos.
        System.out.print("Estatura en metros (use punto): ");
        double estatura = sc.nextDouble();
        System.out.println("estatura = " + estatura);
 
        sc.close();
        //Cierra el objeto Scanner y libera los recursos asociados.
        
    }
}
