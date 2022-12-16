package lista2;

import java.util.Scanner;

public class Exercicio6Celsius_2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float fahrenheit;
		float celsius;

		System.out.println("Digite a temperatura em Fahrenheit para ser convertida em Celsius: ");
		fahrenheit = obj.nextFloat();

		celsius = ((fahrenheit - 32)*5)/9;
		

		System.out.println("A temperatura em Fahrenheit convertida para Celsius é: " + celsius + "ºC");
		obj.close();
	}

}

