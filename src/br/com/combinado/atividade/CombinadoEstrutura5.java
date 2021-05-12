package br.com.combinado.atividade;

public class CombinadoEstrutura5 {

	public static void main(String[] args) {
		int[] numeros = { 50, 25, 70, 60, 1 };
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
