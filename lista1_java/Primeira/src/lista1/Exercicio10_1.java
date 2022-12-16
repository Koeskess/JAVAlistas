package lista1;

import java.util.Scanner;

public class Exercicio10_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float lado;
		Double area;


		System.out.println("Digite o valor dos lados do quadrado:  ");
		lado = obj.nextFloat();

		area = Math.pow(lado, 2);
		System.out.println("A área do quadrado é: " + area);
		
		obj.close();
	}

}
