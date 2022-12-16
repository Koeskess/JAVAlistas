package lista4;

import java.util.Scanner;

public class Exercicio13_4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		float nota1 = obj.nextFloat();
		System.out.println("Informe a segunda nota: ");
		float nota2 = obj.nextFloat();
		System.out.println("Informe a terceira nota: ");
		float nota3 = obj.nextFloat();

		float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.println("A média é: " + media);
		obj.close();
	}

}
