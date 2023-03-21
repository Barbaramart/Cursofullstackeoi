package ejercicioPrueba;

public class EjercicioPrueba {
	// While1.java
	// Comprobación repetitiva de condiciones con "while"
	// Introducción a Java, Nacho Cabanes

	import java.util.Scanner;

	class While1 {

	    public static void main( String args[] ) {

	        Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduce un cero: ");
	        int dato = teclado.nextInt();
	        while (dato != 0) {
	            System.out.print("No era cero. Introduce cero: ");
	            dato = teclado.nextInt();
	        }
	        System.out.println("Terminado!");
	    }
	}// Contar1a5.java
	// Contar del 1 al 5 con "while"
	// Introducción a Java, Nacho Cabanes

	class Contar1a5 {

	    public static void main( String args[] ) {

	        int x = 1;

	        while (x <= 5) {
	            System.out.println( x );
	            x++;
	        }
	    }
	}

