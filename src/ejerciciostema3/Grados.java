package ejerciciostema3;

import java.util.Scanner;

public class Grados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//introduccion grados celcius//
		System.out.print("Introduzca grados centigrados que quiera convertir a grados Fahrenheit: ");
		double celsius = sc.nextDouble();
		
		
		
		//conversion// tener en cuanta el añadir .0 valor despues de coma para mejorar la exactitud del resultado//
		double Fahrenheit = (double)  (9.0/5.0) * celsius + 32;
		
		//mostrar resultado//
		
		System.out.print("Tus grados celcius transformados a Fahrenheit es " + Fahrenheit);



	}

}
