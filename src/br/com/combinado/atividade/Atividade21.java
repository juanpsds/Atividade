package br.com.combinado.atividade;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Deseja informar um numero: ");
		boolean informarNumero = teclado.nextBoolean();
		int[] array = new int[3];
		int indice = 0;
		while (informarNumero) {
			if (indice > 0 && indice % 3 == 0) {
				int tamanho = array.length + 10;
				int[] aux = array;
				array = new int[tamanho];
				for (int i = 0; i < aux.length; i++) {
					array[i] = aux[i];
				}
			}
			System.out.print("Digite seu numero: ");
			array[indice++] = teclado.nextInt();
			System.out.print("deseja infomar mais algum numero: ");
			informarNumero = teclado.nextBoolean();
		}
		for (int i = 0; i < indice; i++) {
			System.out.println(array[i]);
			teclado.close();
		}
	}

}
