package lista3;

import java.util.Scanner;

public class Exercicio3_3Quadrado {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int A;
		int B;
		int difQuadrado;
		double quadrado;

		System.out.println("Informe o valor de A: ");
		A = obj.nextInt();
		System.out.println("Informe o valor de B: ");
		B = obj.nextInt();

		difQuadrado = A - B;
		quadrado = Math.pow(difQuadrado, 2);

		//primeiro a base depois o expoente
		
		System.out.println("O valor é: " + quadrado);
		obj.close();

	}

}
