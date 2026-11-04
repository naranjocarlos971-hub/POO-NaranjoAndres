package ec.edu.epn.poo.lab4;
 
import java.util.Locale;
import java.util.Scanner;
 
public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        final double IVA = 0.15;
 
        // Catálogo: un arreglo de objetos (cada producto es una sola cosa)
        Producto[] catalogo = {
            // TODO 1: crear los 5 productos del Lab S3 con new Producto(...)
            //         Cuaderno 2.50 10 · Esfero 0.75 50 · Borrador 0.40 30
            //         Regla 1.20 0 · Carpeta 3.10 8
        };
        int[] carrito = new int[catalogo.length];   // unidades compradas
 
        int opcion;
        do {
            System.out.println();
            System.out.println("=== CAJA REGISTRADORA ===");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Agregar producto");
            System.out.println("3. Ver recibo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número de opción: ");
                sc.next();
            }
            opcion = sc.nextInt();
 
            switch (opcion) {
                case 1 -> {
                    System.out.printf("%-4s %-10s %7s %6s%n",
                            "Cód", "Producto", "Precio", "Stock");
                    // TODO 2: recorrer catalogo y mostrar código (i + 1),
                    //         nombre, precio y stock con el formato del Lab S3
                }
                case 2 -> {
                    int codigo;
                    do {
                        System.out.print("Código (1 a " + catalogo.length
                                + "): ");
                        while (!sc.hasNextInt()) {
                            System.out.print("No es un entero. Código: ");
                            sc.next();
                        }
                        codigo = sc.nextInt();
                    } while (codigo < 1 || codigo > catalogo.length);
                    int k = codigo - 1;
                    int cantidad;
                    do {
                        System.out.print("Cantidad: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("No es un entero. Cantidad: ");
                            sc.next();
                        }
                        cantidad = sc.nextInt();
                    } while (cantidad <= 0);
                    // TODO 3: si cantidad <= catalogo[k].stock, sumarla a
                    //         carrito[k], restarla del stock y mostrar
                    //         "Agregado: ..."; si no, mostrar
                    //         "Stock insuficiente (disponible: N)"
                }
                case 3 -> {
                    double subtotal = 0;
                    System.out.println("------------ RECIBO ------------");
                    // TODO 4: recorrer el carrito; si carrito[i] > 0, calcular
                    //         linea = carrito[i] * precio, sumarla al
                    //         subtotal e imprimir "%-10s %3d x %5.2f %8.2f%n"
                    double porcentaje;
                    if (subtotal >= 100) {
                        porcentaje = 0.10;
                    } else if (subtotal >= 50) {
                        porcentaje = 0.05;
                    } else {
                        porcentaje = 0.0;
                    }
                    double descuento = subtotal * porcentaje;
                    double iva = (subtotal - descuento) * IVA;
                    double total = subtotal - descuento + iva;
                    System.out.println("--------------------------------");
                    System.out.printf(Locale.US, "%-23s %8.2f%n",
                            "Subtotal", subtotal);
                    System.out.printf(Locale.US, "%-23s %8.2f%n",
                            "Descuento", descuento);
                    System.out.printf(Locale.US, "%-23s %8.2f%n",
                            "IVA 15 %", iva);
                    System.out.printf(Locale.US, "%-23s %8.2f%n",
                            "TOTAL", total);
                }
                case 0 -> System.out.println("Gracias por su compra.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
