package lista4;

import java.util.Scanner;

public class Exercicio28_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primero valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();

		if (valor1 > valor2 || valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1);

		}

		else if (valor2 > valor1 || valor2 > valor3) {
			System.out.println("O maior valor é: " + valor2);
		} else if (valor3 > valor1 || valor3 > valor2) {
			System.out.println("O maior valor é: " + valor3);
		}

		sc.close();
	}

}
