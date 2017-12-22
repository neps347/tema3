package ejerciciostema3;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	//introduccion primera variable Kilogramos/peso //
	System.out.print("Por favor introduzca su peso en kilogramos: "); 
	double kilogramos = sc.nextDouble();
	double peso = kilogramos;

	//introduccion segunda variable Altura/metros //
	System.out.print("Bienvenido puede decirme que altura tienes para " + peso + " kilogramos ");
	double altura = sc.nextDouble();
	double metros = altura;
	
	//Frase con Kilogramos y altura//
	System.out.print("vamos a calcular IMC para " + peso + " kilogramos y " + altura + " metros.");
	
	
	//Calculo IMC en base a datos obtenidos//
	double imc = (double)peso / (altura * altura);
	//IMS = peso / altura2
	
	//Frase con Resultado de la operacion de calculo//
	System.out.print("Tu imc " + imc);
	


	}
}



