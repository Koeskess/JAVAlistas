package lista4;

import java.util.Scanner;

public class Exercicio14_4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int valor;

		System.out.println("Informe um valor: ");
		valor = obj.nextInt();

		if (valor < 10) {
			System.out.println("O n�mero: " + valor + " � menor que dez!");
		} else {
			System.out.println("O n�mero: " + valor + " � maior que dez!");
		}
		obj.close();
	}
}
