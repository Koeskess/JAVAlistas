package lista4;

import java.util.Scanner;

public class Exercicio31_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite o valor B: ");
		int valorB = sc.nextInt();
		System.out.println("Digite o valor C: ");
		int valorC = sc.nextInt();

		if (valorA + valorB < valorC || valorB + valorC < valorA || valorA + valorC < valorB) {
			System.out.println("É um triangulo");
		} else {
			System.out.println("Não é um triangulo");
		}

		sc.close();
	}
}
