package ec.edu.epn.poo.lab2;
 
public class Conversiones {
    public static void main(String[] args) {
    	//public	Permite acceder al método desde fuera de la clase.
    	//static	Permite ejecutar el método sin crear un objeto.
    	//void	Indica que no devuelve ningún valor.
    	//main	Nombre del método principal.
    	//String[] args	Permite recibir argumentos de texto al ejecutar el programa.
        
    	// Ampliación (implícita)
        int i = 100;
        long l = i;
        double d = l;
        System.out.println("int -> long -> double : " + d);
        long grande = 123456789L;
        float f = grande;          // ampliación con pérdida
        System.out.println("123456789L como float : " + f);
 
        // Estrechamiento (cast explícito)
        System.out.println("(int) 9.99            : " + (int) 9.99);
        System.out.println("(int) -9.99           : " + (int) -9.99);
        System.out.println("Math.round(9.5)       : " + Math.round(9.5));
        //Math.round()   Permite redondear un número al entero más cercano. 
        System.out.println("(byte) 200            : " + (byte) 200);
        System.out.println("(char) 65             : " + (char) 65);
        System.out.println("(int) 3e10            : " + (int) 3e10);
        //Esta instrucción convierte un número expresado en notación científica a tipo int.
 
        // Promoción numérica
        byte a = 10, b = 20;
        byte c = (byte) (a + b);              // sin el cast no compila
        System.out.println("(byte) (a + b)        : " + c);
        System.out.println("7 / 2                 : " + 7 / 2);
        // imprime  3 por que 7 y 2 son tipo int, 7/2 solo toma la parte entera
        double y = 7 / 2;
        //Estamos declarando una variable double, pero la operación que realizamos es:
        // 7/2 , Como ambos operandos son de tipo int, Java primero realiza una división entera.
        //Después, el resultado entero 3 se convierte automáticamente a double.
        System.out.println("double y = 7 / 2      : " + y);
        System.out.println("7 / 2.0               : " + 7 / 2.0);
        System.out.println("'A' + 2               : " + ('A' + 2));
        //Es un carácter de tipo char.
        //En Unicode, el carácter A tiene el valor numérico 65.
 
        // Texto <-> número
        int n = Integer.parseInt("42");
        //int: tipo de dato de la variable.
        //n: nombre de la variable.
        //Integer: clase envolvente de int.
        //parseInt(): método que convierte texto a entero.
        //"42": cadena de texto que queremos convertir.
        double p = Double.parseDouble("3.5");
        //double: tipo de dato de la variable.
        //p: nombre de la variable.
        //Double: clase envolvente de double.
        //parseDouble(): método que convierte texto a double.
        //"3.5": cadena de texto que contiene un número decimal.
        String s = String.valueOf(n + p);
        //String: tipo de dato que almacena cadenas de caracteres.
        //s: nombre de la variable.
        //String.valueOf(): método que convierte un valor en una representación textual.
        //n + p: operación matemática que queremos realizar antes de convertir el resultado.
        //Como estamos sumando un int con un double, Java convierte el entero a double para realizar la operación.
        System.out.println("parseInt + parseDouble: " + s);
    }
}
