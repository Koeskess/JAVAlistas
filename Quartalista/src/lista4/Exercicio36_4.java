package lista4;

import java.util.Scanner;

public class Exercicio36_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade da primeira mulher:");
		int mulher1 = sc.nextInt();
		System.out.println("Digite a idade da segunda mulher:");
		int mulher2 = sc.nextInt();
		System.out.println("Digite a idade do primero homem:");
		int homem1 = sc.nextInt();
		System.out.println("Digite a idade do segundo homem:");
		int homem2 = sc.nextInt();

		if (mulher1 > mulher2 || homem1 > homem2) {
			int mulher_velha = mulher1;
			int mulher_nova = mulher2;
			int homem_velho = homem1;
			int homem_novo = homem2;
			int mult = mulher_velha * homem_novo;
			int soma = mulher_nova + homem_velho;
			System.out.println("A soma das idades da mulher mais velha com o homem mais novo é: " + soma);
			System.out.println("E o produto das idades do homem mais novo com a mulher mais velha é: " + mult);
		} else {
			int mulher_velha = mulher2;
			int mulher_nova = mulher1;
			int homem_velho = homem2;
			int homem_novo = homem1;
			int mult = mulher_velha * homem_novo;
			int soma = mulher_nova + homem_velho;
			System.out.println("A soma das idades da mulher mais velha com o homem mais novo é: " + soma);
			System.out.println("E o produto das idades do homem mais novo com a mulher mais velha é: " + mult);
		}

		sc.close();
	}

}
