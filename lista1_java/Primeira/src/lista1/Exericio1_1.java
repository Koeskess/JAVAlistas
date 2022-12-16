package lista1;

import java.util.Scanner;

public class Exericio1_1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num;
		int sucessor;
		System.out.println("Informe um número: ");
		num = obj.nextInt();

		sucessor = num + 1;
		System.out.println("O sucessor de " + num + " é: " + sucessor);

		obj.close();

	}

}
