package lista4;

import java.util.Scanner;

public class Exercicio27_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();

		if (valor1 >= 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}

		sc.close();

	}

}
