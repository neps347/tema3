package ejerciciostema3;

import java.util.Scanner;

public class GradosContrario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//introduccion grados Fahrenheit//
		System.out.print("Introduzca grados Fahrenheit que quiera convertir a grados Celcius: ");
		double Fahrenheit = sc.nextDouble();
		
		
		
		//conversion//
		double Celcius = (double) (Fahrenheit - 32.0) / 1.8;
		
		//Operacion C = (F – 32)/1.8//
		
		//mostrar resultado//
		
		System.out.print("Tus grados celcius transformados a Fahrenheit son " + Celcius);



	}

}
