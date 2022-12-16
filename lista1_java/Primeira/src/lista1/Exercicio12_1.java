package lista1;

import java.util.Scanner;

public class Exercicio12_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float raio;
		Double area;

		System.out.println("Digite o raio: ");
		raio = obj.nextFloat();

		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é:  " + area);
		
		obj.close();
	}

}
