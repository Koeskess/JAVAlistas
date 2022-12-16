package lista4;

import java.util.Scanner;

public class Exercicio29_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiero valor: ");
		int valor3 = sc.nextInt();

		if (valor1 > valor2 || valor1 > valor3 || valor2 > valor3) {
			int maior = valor1;
			int medio = valor2;
			int menor = valor3;
			int soma = maior + medio;
			System.out.println("A soma dos dois maiores valores é: " + soma);

		} else if (valor2 > valor1 || valor2 > valor3 || valor3 > valor1) {
			int maior = valor2;
			int medio = valor3;
			int menor = valor1;
			int soma = maior + medio;
			System.out.println("A soma dos dois maiores valores é: " + soma);

		} else if (valor3 > valor1 || valor3 > valor2 || valor1 > valor2) {
			int maior = valor3;
			int medio = valor1;
			int menor = valor2;
			int soma = maior + medio;
			System.out.println("A soma dos dois maiores valores é: " + soma);
		}

		sc.close();

	}

}
