package lista2;

import java.util.Scanner;

public class Exercicio5Fahrenheit_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float celsius;
		float fahrenheit;

		System.out.println("Informe a temperatura em graus Celsius: ");
		celsius = obj.nextFloat();

		fahrenheit = ((9 * celsius + 160) / 5);

		System.out.println("A temperatura em Celsius convertida em Fahrenheit é: " + fahrenheit + "°F");
		obj.close();
	}
}
