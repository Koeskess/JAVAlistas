package lista1;

import java.util.Scanner;

public class Exercicio9_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int dma;
		int dme;
		float resultado;

		System.out.println("Digite o valor da diagonal maior: ");
		dma = obj.nextInt();
		System.out.println("Digite o valor da diagonal menor: ");
		dme = obj.nextInt();

		resultado = (dma * dme) / 2;
		System.out.println("A área do losango é: " + resultado);
		
		obj.close();
	}

}
