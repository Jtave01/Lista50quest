package ex;

import java.util.Scanner;

public class Ex1 {
	public static void main(String []args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Entre com a nota ");

		int nota = sc.nextInt();

		while (!(nota >= 0 && nota <=10)) {
		 System.out.println("Valor invalido ");	
		 System.out.println("Entre com a nota ");
		 nota = sc.nextInt();

			
		}

		System.out.println("Valor valido ");	
	}
	
}
