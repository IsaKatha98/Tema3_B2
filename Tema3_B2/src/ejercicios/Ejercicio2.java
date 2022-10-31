package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		//Declaramos variables
		
		int num=0;//Inicializamos la variable en 0 porque queremos mostrar los 20 resultados siguientes.
				
		//Instrucciones. Empezamos con el bloque de instrucciones..
				
		do {
			
			if (num%2==0) { 					//Establecemos una condición para seleccionar a los números pares.
		
					
			//Imprimimos el resultado.
					
			System.out.println(num);
			
			}
			
			num++; 								//Una vez elegidos los pares se hace el incremento en uno.
	 
		}
				
		while (num<=200); //Establecemos la condición, que deberá ejecutar el bucle mientras que num sea igual o menor que 200.	

	}

}
