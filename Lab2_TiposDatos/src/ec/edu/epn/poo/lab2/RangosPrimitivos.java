package ec.edu.epn.poo.lab2;
 
public class RangosPrimitivos {
    public static void main(String[] args) {
        String e = "%-8s %-5d %-21s %s%n";   // formato de cada fila
        //%-8s	Texto alineado a la izquierda, ocupando 8 espacios.
        //%-5d	Número entero alineado a la izquierda, ocupando 5 espacios
        //%-21s	Texto alineado a la izquierda, ocupando 21 espacios.
        //%s	Texto.
        //%n	Salto de línea.
        String encabezado = "%-8s %-5s %-21s %s%n"; 
        
        System.out.printf(encabezado,"Tipo", "Bits", "Mínimo", "Máximo");
        
        System.out.printf(e, "byte", Byte.SIZE,
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        //Byte.SIZE	Obtiene el tamaño en bits de byte.
        //MIN_VALUE	Obtiene el límite mínimo definido para el tipo.
        //MAX_VALUE	Obtiene el límite máximo definido para el tipo.
        System.out.printf(e, "short", Short.SIZE,
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf(e, "int", Integer.SIZE,
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf(e, "long", Long.SIZE,
                Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf(e, "float", Float.SIZE,
                Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf(e, "double", Double.SIZE,
                Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf(e, "char", Character.SIZE,
                (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        //(int)	Convierte un valor a tipo entero.
    }
}
