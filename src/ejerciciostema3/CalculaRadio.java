package ejerciciostema3;

import java.util.Scanner;

public class CalculaRadio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor introduzca diametro: "); //corregir variable
		
		int diametro = sc.nextInt();

		double radio = (double)diametro / 2;

		System.out.print("El radio es " + radio);


	}

}
