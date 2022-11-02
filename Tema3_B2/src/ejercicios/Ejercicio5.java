package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
	int random;//Variable 
	int max=100;
	int min=1;
	String respuesta;
	
	//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola.
								
	Scanner sc= new Scanner (System.in); 

		
	do { 
		
		random= (int)((Math.random()*(max-min)+min));
		
		System.out.println("¿Es "+random+" el número que ha pensado?");
		
		respuesta= sc.next();

		
		if ("mayor".equals(respuesta)) {
				
			min= random+1;
		
		} else if ("menor".equals(respuesta)) {	
				
			max= random-1;
			
		} else if ("igual".equals(respuesta)) {
		
			System.out.println("Muy bien!");
			
		} else  {
		
			System.out.println("Respuesta no válida.");
		
		}
		
		} while (!"igual".equals(respuesta));

	
	
	}
}