package br.com.combinado.atividade.array;

import java.util.Scanner;

public class EstudoArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[10];
		System.out.print("digite a nota: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = teclado.nextInt();
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		teclado.close();
	}

}
