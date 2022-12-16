package testesAula;

import java.util.Scanner;

public class VotarELSEIF {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = obj.nextInt();

		if (idade < 16) {
			System.out.println("Você não pode votar!");

		}else if (idade < 18 || idade>65) {
			System.out.println("Seu voto é opcional!");
			
		}else {
			System.out.println("Seu voto é obrigatório");
			obj.close();
		}
	}

}
