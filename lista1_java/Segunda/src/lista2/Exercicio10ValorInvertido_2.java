package lista2;

import java.util.Scanner;

public class Exercicio10ValorInvertido_2 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float numA;
		float numB;
		float numC;

		System.out.println("informe o valor de A: ");
		numA = obj.nextFloat();
		System.out.println("Informe o valor de B: ");
		numB = obj.nextFloat();

		numC = numA;
		numA = numB;
		numB = numC;
		System.out.println("O número correspondente a A é: " + numA + " e o correspondente a B é: " + numC);
		obj.close();
	}
}
