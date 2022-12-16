package lista2;

import java.util.Scanner;

public class Exercicio4Carro_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float custoF;
		double percentualD;
		double percentualI;
		double custoFinal;

		System.out.println("Informe o custo de fábrica de seu carro: ");
		custoF = obj.nextFloat();

		percentualD = custoF * 0.28;
		percentualI = custoF * 0.45;
		custoFinal = custoF + percentualD + percentualI;

		System.out.println("O custo final do carro é: R$ " + custoFinal);
		obj.close();
	}
}
