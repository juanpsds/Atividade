package br.com.combinado.atividade;

public class MinhaClasse {

	public static void main(String[] args) {
		int[] vet = {5, 4, 3, 2, 1};
		Insertion.insertionSort(vet);
		for (int num : vet) {
			System.out.print(num + " ");
		}
	}
	
}
