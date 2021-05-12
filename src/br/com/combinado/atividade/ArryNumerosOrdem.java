package br.com.combinado.atividade;

public class ArryNumerosOrdem {

	public static void main(String[] args) {
		int[] vet = { 50, 2, 83, 40, 5, 10 };
 		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] < vet[j]) {
					int aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
				
			}
		}
		for (int i : vet) {
			System.out.println(i);
		}
	}

}
