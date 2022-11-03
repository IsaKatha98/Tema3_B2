package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Las pruebas realizadas en este ejercicio son las siguientes.
	 *
	 *- Introducimos un número y esperamos que salte el mensaje de "respuesta no válida" y nos vuelva a preguntar.
	 *- Introducimos "mayor" y esperamos que genere un número mayor al presentado.
	 *- Introducimos "menor" y esperamos que genere un número menor al presentado.
	 *- Introducimos "igual" y esperamos que muestre el mensaje correspondiente y se cierre el bucle.*/

	public static void main(String[] args) {
	
		int random;//Variable numérica que se genera de forma aleatoria.
		int max=100;//Variable máximo para el número aleatorio.
		int min=1;//Variable mínimo para la variable aleatoria.
		String respuesta;//Variable respuesta que introduce el usuario.
	
		//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola.
		
		Scanner sc= new Scanner (System.in); 

		//Instrucciones. 
	
			do { 																//Abrimos el bloque de instrucciones.
				
				random= (int)((Math.random()*(max-min)+min));						//Generamos el número aleatorio inicial
				
				System.out.println("¿Es "+random+" el número que ha pensado?");		//Imprimos la pregunta inicial.
				respuesta= sc.next();												//Guardamos la respuesta introducida por el usuario.

		
				if ("mayor".equals(respuesta)) {									//Establecemos la primera condición, si la respuesta introducida es "mayor";
				
					min= random+1;													//igualamos el mínimo a la suma del número más 1.
		
				} else if ("menor".equals(respuesta)) {								//Establecemos la segunda condición, cuando la respuesta sea "menor";
				
					max= random-1;													//igualamos la variable introducida a la resta del número aleatorio menos 1.
			
				} else if (!"igual".equals(respuesta)) {							//En caso de introducir un mensaje no válido, se muestra el mensaje 
		
					System.out.println("Respuesta no válida.");						//correspondiente y se repite el bucle.		
			
				} 
		
			} while (!"igual".equals(respuesta));									//El bucle termina en el momento en que la respuesta sea igual.
			
			System.out.println("Muy bien!");					

		//Por último, cerramos el escáner.
		
		sc.close();	
	
	}
}