package testesAula;

import java.util.Scanner;

public class TesteMATH {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int numero;
		int cont = 0;
		System.out.println("Informe um número: ");
		numero= obj.nextInt();
		
		
		for (int  i = 0; i < 1000; i++) {
			int valor = (int)(Math.random()*101);
			
			if(numero==valor) {
				
			
			cont++;
			
			obj.close();
			
			
			}
			
			System.out.println(valor);
		}
		System.out.println("O valor "+ cont);
	}
}
