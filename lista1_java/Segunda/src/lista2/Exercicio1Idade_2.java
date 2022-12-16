package lista2;

import java.util.Scanner;

public class Exercicio1Idade_2 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int idade;
		int mes;
		int dia;
		int total;

		System.out.println("Digite sua idade: ");
		idade = obj.nextInt();
		System.out.println("Digite quantos meses se passaram desde o seu último aniversário: ");
		mes = obj.nextInt();
		System.out.println("Digite quantos dias se passaram desde o seu último aniversário: ");
		dia = obj.nextInt();

		total = (idade * 365) + (mes * 30) + dia;
		System.out.println("A quantidade de dias que você viveu é: " + total);
		obj.close();
	}
}
