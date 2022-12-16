package lista3;

import java.util.Scanner;

public class Exercicio1_3propriedadedistribuitiva {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int A = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int B = sc.nextInt();
		System.out.println("Informe o terceiro número: ");
		int C = sc.nextInt();
		System.out.println("Informe o quarto número: ");
		int D = sc.nextInt();

		int AmB = A + B;
		int AmC = A + C;
		int AmD = A + D;
		int BmC = B + C;
		int BmD = B + D;
		int CmD = C + D;

		int AxB = A * B;
		int AxC = A * C;
		int AxD = A * D;
		int BxC = B * C;
		int BxD = B * D;
		int CxD = C * D;

		System.out.println("Os resultados são: ");
		System.out.println(A + " + " + B + "= " + AmB);
		System.out.println(A + " + " + C + "= " + AmC);
		System.out.println(A + " + " + D + "= " + AmD);
		System.out.println(B + " + " + C + "= " + BmC);
		System.out.println(B + " + " + D + "= " + BmD);
		System.out.println(C + " + " + D + "= " + CmD);
		System.out.println("");
		System.out.println(A + " x " + B + "= " + AxB);
		System.out.println(A + " x " + C + "= " + AxC);
		System.out.println(A + " x " + D + "= " + AxD);
		System.out.println(B + " x " + C + "= " + BxC);
		System.out.println(B + " x " + D + "= " + BxD);
		System.out.println(C + " x " + D + "= " + CxD);
		sc.close();
	}

}
