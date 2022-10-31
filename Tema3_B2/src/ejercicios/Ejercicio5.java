package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
	int random;
	String respuesta;
	
	//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola.
								
	Scanner sc= new Scanner (System.in); 

		
	do { 
		
		random= (int)(Math.random()*100);
		
		System.out.println("¿Es "+random+" el número que ha pensado?");
		
		respuesta= sc.next();

		
		switch (respuesta) {
		
		case "Mayor" ->
		
			random= (int)(Math.random()*random);
			
		case "Menor"-> 
		
			random= (int)(Math.random()*random);
			
		case "Sí"-> 
		
			System.out.println("Muy bien!");
			
		default-> 
		
			System.out.println("Respuesta no válida");
		
		}
		
	} while ();

	}
}