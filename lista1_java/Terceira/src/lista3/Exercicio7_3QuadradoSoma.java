package lista3;

import java.util.Scanner;

public class Exercicio7_3QuadradoSoma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float A, B, C;
		float soma, somaquadrado;

		System.out.println("Informe o valor de A: ");
		A = sc.nextFloat();
		System.out.println("Informe o valor de B: ");
		B = sc.nextFloat();
		System.out.println("Informe o valor de C: ");
		C = sc.nextFloat();

		soma = A + B + C;
		somaquadrado = soma * soma;
		System.out.println("A soma dos tr�s valores do quadrado �: " + somaquadrado);
		sc.close();
	}

}

//VOLTAR NESSA QUEST�O
