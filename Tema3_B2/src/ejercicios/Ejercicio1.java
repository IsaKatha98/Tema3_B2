package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		//Declaramos variables
		
		int num=0;//Inicializamos la variable en 0 porque queremos mostrar los 20 resultados siguientes.
		
		//Instrucciones. Empezamos con el bloque de instrucciones en el que vamos sumando uno al num.
		
		do {
			num++;
			
			//Imprimimos el resultado.
			
			System.out.println(num);
		}
		
		while (num<=19); //Establecemos la condición, que deberá ejecutar el bucle mientras que num sea igual o menor que 19.


	}

}
