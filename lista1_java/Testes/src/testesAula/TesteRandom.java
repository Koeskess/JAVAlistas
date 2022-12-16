package testesAula;

import java.util.Scanner;

public class TesteRandom {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int cont = 0;

		for (int i = 0; i < 100; i++) {
			int valor = (int) (Math.random() * 100);

			System.out.println(valor);
			cont++;

			obj.close();
		}
	}
}
