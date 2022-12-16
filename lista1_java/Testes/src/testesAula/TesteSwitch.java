package testesAula;

import java.util.Scanner;

public class TesteSwitch {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Informe um número: ");

		int numero = obj.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
		default:
			System.out.println("Não possui um dia correspondente!");
			break;

		}
		obj.close();
	}

}
