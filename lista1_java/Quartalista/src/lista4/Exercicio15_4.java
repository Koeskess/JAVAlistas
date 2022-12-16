package lista4;

import java.util.Scanner;

public class Exercicio15_4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int valor;

		System.out.println("Informe um valor: ");
		valor = obj.nextInt();

		if (valor >= 0) {
			System.out.println("POSITIVO!");
		} else {
			System.out.println("NEGATIVO!");
		}
		obj.close();

	}
}
