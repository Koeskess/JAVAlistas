package lista4;

import java.util.Scanner;

public class Exercicio18_4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int ano, nascimento, idade;

		System.out.println("Informe o ano atual: ");
		ano = obj.nextInt();
		System.out.println("Informe o ano em que voc� nasceu: ");
		nascimento = obj.nextInt();

		idade = ano - nascimento;

		if (idade >= 16) {
			System.out.println(idade + " anos." + "\nVoc� pode votar!");
		} else {
			System.out.println(idade + " anos." + "\nVoc� n�o pode votar!");
		}
		obj.close();
	}
}
