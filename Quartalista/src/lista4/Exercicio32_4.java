package lista4;

import java.util.Scanner;

public class Exercicio32_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do time A: ");
		String timeA = sc.nextLine();
		System.out.println("Digite o nome do time B: ");
		String timeB = sc.nextLine();

		System.out.println("Quantos gols a equipe " + timeA + " fez?");
		int golsA = sc.nextInt();
		System.out.println("Quantos gols a equipe " + timeB + " fez?");
		int golsB = sc.nextInt();

		if (golsA > golsB) {
			System.out.println("O time " + timeA + " ganhou");
		} else if (golsB > golsA) {
			System.out.println("O time " + timeB + " ganhou");
		} else {
			System.out.println("Houve um empate");
		}

		sc.close();

	}

}
