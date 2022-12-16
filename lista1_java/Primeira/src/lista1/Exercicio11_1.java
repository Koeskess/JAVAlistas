package lista1;

import java.util.Scanner;

public class Exercicio11_1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		float bma;
		float bme;
		float altura;
		float resultado;

		System.out.println("Digite o valor da base maior: ");
		bma = obj.nextFloat();
		System.out.println("Digite o valor da base menor: ");
		bme = obj.nextFloat();
		System.out.println("Digite o valor da altura: ");
		altura = obj.nextFloat();

		resultado = (bma + bme) * altura / 2;
		System.out.println("A área do losango é: " + resultado);
		
		obj.close();
	}

}
