package lista3;

import java.util.Scanner;

public class Exercicio6_3TresValores {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();

		double result = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2);
		System.out.println("O resultado da soma dos quadrados dos valores é: " + result);
		sc.close();

	}
}
