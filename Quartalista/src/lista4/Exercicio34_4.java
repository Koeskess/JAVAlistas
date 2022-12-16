package lista4;

import java.util.Scanner;

public class Exercicio34_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor X: ");
		int X = sc.nextInt();
		System.out.println("Dgite o valor Y: ");
		int Y = sc.nextInt();

		int Z = (X * Y) + 5;

		if (Z <= 0) {
			System.out.println("Resposta: A");
		} else if (Z <= 100) {
			System.out.println("Resposta: B");
		} else {
			System.out.println("Resposta: C");
		}

		sc.close();

	}

}
