package lista1;

import java.util.Scanner;

public class Exercicio8_1 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float base;
		float altura;
		float area;

		System.out.println("Insira a base do tri�ngulo: ");
		base = obj.nextFloat();
		System.out.println("Indique a altura do tri�ngulo: ");
		altura = obj.nextFloat();

		area = (base * altura) / 2;
		System.out.println("A �rea do tri�ngulo �: " + area);
		
		obj.close();
	}

}
