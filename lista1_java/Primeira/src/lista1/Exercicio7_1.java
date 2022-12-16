package lista1;

import java.util.Scanner;

public class Exercicio7_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int base;
		int altura;
		int area;

		System.out.println("Insira a altura do retângulo: ");
		altura = obj.nextInt();

		System.out.println("Indique a base do retângulo: ");
		base = obj.nextInt();

		area = base * altura;
		System.out.println("A área do retângulo é: " + area);
		
		obj.close();

	}

}
