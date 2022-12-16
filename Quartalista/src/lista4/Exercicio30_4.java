package lista4;

import java.util.Scanner;

public class Exercicio30_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		int valor3 = sc.nextInt();

		if (valor1 > valor2 || valor1 > valor3 || valor2 > valor3) {
			int maior = valor1;
			int medio = valor2;
			int menor = valor3;
			System.out.println(menor + " " + medio + " " + maior);
		} else if (valor2 > valor1 || valor2 > valor3 || valor1 > valor3) {
			int maior = valor2;
			int medio = valor1;
			int menor = valor3;
			System.out.println(menor + " " + medio + " " + maior);
		} else if (valor3 > valor1 || valor3 > valor2 || valor1 > valor2) {
			int maior = valor3;
			int medio = valor1;
			int menor = valor2;
			System.out.println(menor + " " + medio + " " + maior);

		}

		sc.close();
	}

}
