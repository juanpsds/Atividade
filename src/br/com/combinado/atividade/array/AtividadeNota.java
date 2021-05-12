package br.com.combinado.atividade.array;

import java.util.Scanner;

public class AtividadeNota {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total = 0;
		int media = 0;
		System.out.println("digete a quantidades de notas: ");
		int qtdNotas = teclado.nextInt();
		int[] notas = new int[qtdNotas];
		System.out.println("digite a nota: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = teclado.nextInt();
			total += notas[i];
		}
		if (qtdNotas > 0) {
			media = total / qtdNotas;
			System.out.println("A media das notas e " + media);
			for (int i = 0; i < notas.length; i++) {
				String resultado = notas[i] >= media ? "cima" : "baixo";
				System.out.println("A nota " + notas[i] + " esta a " + resultado + " da media");
			}
		} else {
			media = 0;
		}
		teclado.close();
	}
	

}
