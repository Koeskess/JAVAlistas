package testesAula;

import java.util.Scanner;

public class primeiroIFELSE {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num = obj.nextInt();

		if (num > 10) {
			System.out.println("É maior que dez!");
		} else {
			System.out.println("É menor que dez!");
			
			obj.close();
		}
	}

}
