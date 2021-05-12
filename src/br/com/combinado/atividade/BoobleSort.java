package br.com.combinado.atividade;

public class BoobleSort {

	public static void main(String args[]) {
		int[] vet = { 8, 9, 3, 5, 1 };
		int aux = 0;
		int i = 0;

		for (i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado:");
		for (i = 0; i < 5; i++) {
			System.out.println(" " + vet[i]);
		}
	}

}
