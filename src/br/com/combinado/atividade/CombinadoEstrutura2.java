package br.com.combinado.atividade;

public class CombinadoEstrutura2 {

	public static void main(String[] args) {
		int[] numeros = { 12, 0, 5, 6 };
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int auxiliar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = auxiliar;
				}
			}
		}
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
