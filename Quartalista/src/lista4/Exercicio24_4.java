package lista4;

import java.util.Scanner;

public class Exercicio24_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salario fixo: ");
		float salario_fixo = sc.nextInt();
		System.out.println("Digite o valor de vendas efetuadas: ");
		float vendas = sc.nextInt();

		if (vendas >= 1500) {

			float salario_final = salario_fixo + (vendas * 3 / 100);
			System.out.println("Seu salario final é de: " + salario_final);
		} else {
			float salario_final = salario_fixo + (vendas * 5 / 100);
			System.out.println("Seu salario final é de: " + salario_final);
		}
		sc.close();
	}

}
