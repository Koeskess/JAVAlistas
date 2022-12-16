package lista4;

import java.util.Scanner;

public class Exercicio37_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de moragos comprados: ");
		int kgmora = sc.nextInt();
		System.out.println("Informe a quantidade de maçãs compradas: ");
		int kgmaca = sc.nextInt();

		double preco_morango = kgmora * 2.50;
		double preco_maca = kgmaca * 2.50;
		double preco_morango1 = kgmora * 2.20;
		double preco_maca1 = kgmaca * 1.50;
		double total1 = preco_maca1 + preco_morango1;
		double total = preco_morango + preco_maca;

		if (kgmora <= 5 || kgmaca <= 5) {
			System.out.println("O total é " + total1);
		} else if (total1 >= 25) {
			double desconto = total1 * (1 / 100);
			double valor_final = total1 - desconto;
			System.out.println("O total é " + valor_final);
		} else if (kgmora > 5 || kgmaca > 5 || kgmaca < 8 || kgmora < 8) {
			System.out.println("O total é " + total1);
		} else if (kgmaca > 8 || kgmora > 8) {
			double desconto = total1 * (1 / 100);
			double valor_final = total1 - desconto;
			System.out.println("O total é " + valor_final);
		}

		sc.close();

	}

}
