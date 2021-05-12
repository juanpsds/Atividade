package br.com.combinado.atividade;

public class CombinadoEstrutura {

	public static void main(String[] args) {
		int[] numeros = { 4, 17, 34, 43, 54, 22 };
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] < numeros[j]) {
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
