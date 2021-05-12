package br.com.combinado.atividade;

public class CombinadoEstrutura9 {
	
	public static void main(String[] args) {
		int[] numeros = {1, 9, 78, 5, 44, 65, 70};
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
