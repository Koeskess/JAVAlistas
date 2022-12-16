package lista4;

import java.util.Scanner;

public class Exercicio23_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char sexo;
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.printf("\nDigite seu sexo (M/F): ");
		sexo = sc.next().charAt(0);
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();

		if (sexo == 'M' || sexo == 'm') {
			double peso_ideal = (72.7 * altura) - 58;
			System.out.println("seu peso ideal é: " + peso_ideal);
		} else {
			double peso_ideal = (62.1 * altura) - 58;
			System.out.println("Seu peso ideal é: " + peso_ideal);
		}
		sc.close();
	}

}
