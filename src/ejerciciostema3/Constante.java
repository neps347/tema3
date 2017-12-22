package ejerciciostema3;

import java.util.Scanner;

public class Constante {

	public static void main(String[] args) {
		
		final double PI = 3.1416;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor introduzca el radio: ");
		double radio = sc.nextDouble();
		
		double area = (double) PI * (radio * radio);
		
		System.out.print("El area es " + area);



	}

}
