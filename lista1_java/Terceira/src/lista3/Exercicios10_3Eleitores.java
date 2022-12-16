package lista3;

import java.util.Scanner;

public class Exercicios10_3Eleitores {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int candidato_a, candidato_b;
		int candidato_c, voto_branco, voto_nulo, voto_valido, eleitores;
		int perc_a, perc_b, perc_c, branco_por, nulo_por, valido_por;

		System.out.println("Digite a quantidade de votos para o candidato A: ");
		candidato_a = obj.nextInt();
		System.out.println("Digite a quantidade de votos para o candidato B: ");
		candidato_b = obj.nextInt();
		System.out.println("Digite a quantidade de votos para o candidato C: ");
		candidato_c = obj.nextInt();
		System.out.println("Digite o total de votos em branco: ");
		voto_branco = obj.nextInt();
		System.out.println("Digite o total de votos nulos: ");
		voto_nulo = obj.nextInt();

		voto_valido = candidato_a + candidato_b + candidato_c;
		eleitores = voto_branco + voto_nulo + voto_valido;

		perc_a = (candidato_a * 100) / eleitores;
		perc_b = (candidato_b * 100) / eleitores;
		perc_c = (candidato_c * 100) / eleitores;
		branco_por = (voto_branco * 100) / eleitores;
		nulo_por = (voto_nulo * 100) / eleitores;
		valido_por = (voto_valido * 100) / eleitores;

		System.out.println("A quantidade de eleitores é: " + eleitores);
		System.out.println("A porcentagem de votos válidos para o candidato A é: " + perc_a + "%");
		System.out.println("A porcentagem de votos válidos para o candidato B é: " + perc_b + "%");
		System.out.println("A porcentagem de votos válidos para o candidato C é: " + perc_c + "%");
		System.out.println("A porcentagem de votos nulos é: " + nulo_por + "%");
		System.out.println("A porcentagem de votos em branco é de: " + branco_por + "%");
		
		obj.close();
		
	}

}
