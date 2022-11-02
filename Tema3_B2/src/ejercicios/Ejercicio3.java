package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int contador=0;
		int suma=0;
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
											
		Scanner sc= new Scanner (System.in);
											
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
				
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		do {
			
			suma+=contador;
			contador++;
			
		} while (contador<num);
		
		System.out.println("Resultado: ");
	}

}
