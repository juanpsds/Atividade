package br.com.combinado.atividade;

import java.util.Scanner;

public class AtividadeFor {
	
	public static void main(String[] args) {
		int total = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("deseja inforamr um numero: ");
		boolean desejaInformar = teclado.nextBoolean();
		while (desejaInformar) {
			System.out.print("qual o numero: ");
			int numero = teclado.nextInt();
			for (int i = 1; i < numero; i++) {
				total += i;
				System.out.println(total);
			}
			System.out.print("deseja informar novamente: ");
			desejaInformar = teclado.nextBoolean();
		}
		teclado.close();
	}

}
