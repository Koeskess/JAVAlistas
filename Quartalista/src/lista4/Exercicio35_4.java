package lista4;

import java.util.Scanner;

public class Exercicio35_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustivel que deseja abastecer (A/G):");
		String combustivel = sc.next();
		System.out.println("Digite a quantidade de litros abastecidos: ");
		float litros = sc.nextFloat();

		double A = 2.90;
		double G = 3.30;

		if (combustivel == "A" || litros <= 20) {
			double total = litros * A;
			double desconto = 0.03 * total;
			double Valor = total - desconto;
			System.out.println("O valor total é: " + Valor);
		} else if (combustivel == "A" && litros > 20) {
			double total = litros * A;
			double descontoA = 0.05 * total;
			double Valor = total - descontoA;
			System.out.println(Valor);
		} else if (combustivel == "G" && litros <= 20) {
			double total = litros * G;
			double descontoG = 0.04 * total;
			double Valor = total - descontoG;
			System.out.println(Valor);
		} else if (combustivel == "G" && litros > 20) {
			double total = litros * G;
			double descontoG = 0.06 * total;
			double Valor = total - descontoG;
			System.out.println(Valor);
		}

		sc.close();

	}
}
