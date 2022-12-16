package lista4;

import java.util.Scanner;

public class Exercicio21_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora de inicio do jogo: ");
		int hora = sc.nextInt();
		System.out.println("Digite a hora do fim do jogo: ");
		int hora_final = sc.nextInt();

		int tempo = hora_final - hora;

		if (tempo <= 0) {
			tempo = tempo + 24;
			System.out.println("O jogo teve a duração de " + tempo);
		} else {
			System.out.println("O jogo teve a duração de " + tempo);
		}

		sc.close();

	}

}
