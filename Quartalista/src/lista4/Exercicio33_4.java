package lista4;

import java.util.Scanner;

public class Exercicio33_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O primeiro valor é maior " + valor1);
		} else if (valor2 > valor1) {
			System.out.println("O segundo valor é maior " + valor2);
		} else {
			System.out.println("Os números são iguais");
		}
		sc.close();
	}

}
