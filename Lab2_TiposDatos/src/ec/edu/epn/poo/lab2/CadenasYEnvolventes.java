package ec.edu.epn.poo.lab2;
 
public class CadenasYEnvolventes {
    public static void main(String[] args) {
        // == frente a equals() con String
        String a = "Hola";
        String b = "Hola";
        String c = new String("Hola");
        //new: solicita la creación de un nuevo objeto.
        //String("Hola"): indica que el objeto tendrá el contenido "Hola".
        System.out.println("a == b        : " + (a == b));
        //a == b : true
        //Porque a y b hacen referencia al mismo objeto del String Pool.
        System.out.println("a == c        : " + (a == c));
        //a == c : false
        //Porque a y c hacen referencia a objetos diferentes, aunque ambos contengan "Hola".
        System.out.println("a.equals(c)   : " + a.equals(c));
        //a.equals(c) : true
        //Porque equals() compara el contenido de las cadenas y ambas contienen "Hola".
 
        
        
        // Inmutabilidad
        //Un objeto inmutable es aquel cuyo contenido no puede 
        //modificarse después de haber sido creado.
        String nombre = "epn";
        nombre.toUpperCase();
        //El método toUpperCase() convierte las letras minúsculas en mayúsculas.
        System.out.println("sin reasignar : " + nombre);
        //sin reasignar : epn
        //Como no guardamos el resultado en ninguna variable, 
        //la nueva cadena no se utiliza.
        nombre = nombre.toUpperCase();
        //Ahora sí guardamos el resultado del método en la variable nombre.
        System.out.println("reasignando   : " + nombre);
 
        
        
        // Caché de Integer
        //Integer es una clase envolvente (wrapper class) que permite representar
        //un número entero primitivo int como un objeto.
        Integer x1 = 127, x2 = 127;
        //Como 127 está dentro del rango habitual de la caché, Java reutiliza 
        //el mismo objeto.
        Integer y1 = 128, y2 = 128;
        //Como 128 está fuera del rango predeterminado de la caché, 
        //normalmente se crean dos objetos diferentes.
        System.out.println("127 == 127    : " + (x1 == x2));
        //127 == 127 : true
        //Porque las dos variables hacen referencia al mismo objeto reutilizado de la caché.
        System.out.println("128 == 128    : " + (y1 == y2));
        //128 == 128 : false
        //Porque normalmente son dos objetos diferentes, aunque tengan el mismo valor.
        System.out.println("128 equals    : " + y1.equals(y2));
        //128 equals : true
        //Porque equals() compara el valor numérico de los objetos Integer.
        
        
 
        // StringBuilder
        //es una clase de Java que permite construir y modificar cadenas de texto 
        //sin tener que crear un nuevo objeto String en cada operación de modificación.
        StringBuilder sb = new StringBuilder();
        //StringBuilder: tipo de objeto.
        //sb: nombre de la variable.
        //new: crea un objeto.
        //StringBuilder(): constructor sin argumentos.
        sb.append("Nota: ").append(18).append("/20");
        //El método append() agrega información al final del contenido actual.
        System.out.println("StringBuilder : " + sb.toString());
        //StringBuilder : Nota: 18/20
        //El método toString() convierte el contenido de StringBuilder en un objeto de 
        //tipo String.
    }
}
