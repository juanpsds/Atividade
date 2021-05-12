package br.com.combinado.atividade;

import java.util.Scanner;

public class Atividade20 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Deseja infomar algum numero: ");
		boolean informarNumero = teclado.nextBoolean();
		int[] array = new int [10];
		int indice = 0;
		while (informarNumero) {
			System.out.print("informe o numero: ");
			array[indice++] = teclado.nextInt();
			System.out.print("deseja informar novamente: ");
			informarNumero = teclado.nextBoolean();
		}
		for (int i = 0; i < indice; i++) {
			System.out.println(array[i]);
		}
		teclado.close();
	}

}
