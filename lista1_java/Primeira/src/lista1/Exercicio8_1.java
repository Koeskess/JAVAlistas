package lista1;

import java.util.Scanner;

public class Exercicio8_1 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float base;
		float altura;
		float area;

		System.out.println("Insira a base do triângulo: ");
		base = obj.nextFloat();
		System.out.println("Indique a altura do triângulo: ");
		altura = obj.nextFloat();

		area = (base * altura) / 2;
		System.out.println("A área do triângulo é: " + area);
		
		obj.close();
	}

}
