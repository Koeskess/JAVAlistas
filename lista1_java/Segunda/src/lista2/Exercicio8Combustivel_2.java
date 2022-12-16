package lista2;

import java.util.Scanner;

public class Exercicio8Combustivel_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int tempoG;
		float velocidade;
		float distancia;
		float litrosUsados;

		System.out.println("Informe o tempo gasto na viagem: ");
		tempoG = obj.nextInt();
		System.out.println("Informe a velocidade média durante a viagem: ");
		velocidade = obj.nextFloat();

		distancia = tempoG * velocidade;
		litrosUsados = distancia / 12;

		System.out.println("A velocidade média durante a viagem foi de: " + velocidade);
		System.out.println("O tempo gasto na viagem foi de: " + tempoG);
		System.out.println("A distância percorrida foi de: " + distancia);
		System.out.printf("E a quantidade de litros usados na viagem foi de: %.3f", litrosUsados);
		obj.close();
	}

}
