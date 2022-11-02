package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int contador=0;
		int mult;
						
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
													
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		do {
			contador++;											//Contamos las veces que se accede al bucle.
			mult=num*contador;									//Hacemos la multiplicación.
			System.out.println(num+" x "+contador+" = "+mult);	//Imprimimos el resultado.
		} 
		
		while (contador<10); 									//Para que el bucle se pare al llegar a 10.
		
		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
