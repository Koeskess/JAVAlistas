package lista4;

import java.util.Scanner;

public class Exercicio26_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade atual em estoque: ");
		int qtd_estoque = sc.nextInt();
		System.out.println("Digite a quantidade m�xima em estoque: ");
		int qtd_maxima = sc.nextInt();
		System.out.println("Digite a quantidade m�nima em estoque: ");
		int qtd_minima = sc.nextInt();

		float media = (qtd_maxima + qtd_minima) / 2;

		if (qtd_estoque >= media) {

			System.out.println("N�o efetuar compra");

		} else {
			System.out.println("Efetuar compra");
		}

		sc.close();
	}

}
