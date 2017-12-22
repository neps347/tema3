package ejerciciostema3;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
	//Constante//
		final double EUR = 1.17473;
		
		
		
		//Scaner para añadir palabras por teclado//
		Scanner sc = new Scanner(System.in);
		
	//Se piden datos añadir datos//	
	System.out.print("Introduzca cantidad a convertir en Euros: ");
		double euros = (int) sc.nextDouble();
		
		
		//Conversion//
		double dolares = (double) euros * 1.17473;
	
		
	//Frase con Resultado//	
		System.out.print("Tus euros convertidos a dolares valen " + dolares);
	}

}
