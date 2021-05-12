package br.com.combinado.atividade.array;

import java.util.Scanner;

public class ForBidmsional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Digite o valor das matrix: ");
				matrix[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		teclado.close();
	}

}
