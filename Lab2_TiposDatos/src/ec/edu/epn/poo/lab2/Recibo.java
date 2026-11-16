package ec.edu.epn.poo.lab2;
 
import java.text.NumberFormat;
//Esta clase permite dar formato a los números, por ejemplo, convertir 
//un valor numérico en una representación de moneda.
import java.util.Locale;
import java.util.Scanner;
 
public class Recibo {
    public static void main(String[] args) {
        final double IVA = 0.15;                 // IVA de Ecuador
        //final: indica que el valor no puede modificarse después de su inicialización.
        //double: tipo de dato que permite almacenar números decimales.
        Scanner sc = new Scanner(System.in);
        /*Esta instrucción crea un objeto de la clase Scanner.
        Scanner	Clase que permite leer datos.
        sc	Nombre de la variable que referencia al objeto.
        new	Operador que crea un nuevo objeto.
        Scanner()	Constructor de la clase Scanner.
        System.in	Flujo de entrada estándar, normalmente el teclado.*/
        sc.useLocale(Locale.US);
 
        System.out.print("Producto: ");
        String producto = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
 
        double subtotal = cantidad * precio;
        double iva = subtotal * IVA;
        double total = subtotal + iva;
 
        System.out.println();
        System.out.println("=========== RECIBO ===========");
        System.out.printf(Locale.US, "%-14s %4s %10s%n",
                "Producto", "Cant", "Subtotal");
        /*Locale.US: Indica que utilizaremos las convenciones regionales de Estados Unidos 
        /para representar los valores numéricos.
        %-14s	Texto alineado a la izquierda con un ancho mínimo de 14 caracteres.
        %4s	Texto alineado a la derecha con un ancho mínimo de 4 caracteres.
        %10s	Texto alineado a la derecha con un ancho mínimo de 10 caracteres.
        %n	Salto de línea.   */
        System.out.printf(Locale.US, "%-14.14s %4d %10.2f%n",
                producto, cantidad, subtotal);
        /*%-14.14s	Texto alineado a la izquierda, ancho mínimo de 14 caracteres y máximo de 14 caracteres.
        %4d	Número entero con un ancho mínimo de 4 espacios.
        %10.2f	Número decimal con un ancho mínimo de 10 espacios y exactamente 2 decimales.
        %n	Salto de línea.     */
        System.out.println("------------------------------");
        System.out.printf(Locale.US, "%-19s %10.2f%n", "IVA 15 %", iva);
        /*%-19s: texto alineado a la izquierda con un ancho mínimo de 19 caracteres.
        %10.2f: número decimal con un ancho mínimo de 10 caracteres y dos decimales.
        %n: salto de línea.   */
        System.out.printf(Locale.US, "%-19s %10.2f%n", "TOTAL", total);
 
        NumberFormat moneda = NumberFormat.getCurrencyInstance(Locale.US);
        /*NumberFormat: clase que permite dar formato a números.
        moneda: nombre de la variable que referencia al objeto.
        getCurrencyInstance(): método que obtiene un formato monetario.
        Locale.US: establece el formato monetario de Estados Unidos, que utiliza el dólar estadounidense.   */
        System.out.println("Total a pagar: " + moneda.format(total));
        //El método format() recibe el valor almacenado en total y lo convierte en
        //una cadena de texto con formato monetario.
        sc.close();
        
    }
}
