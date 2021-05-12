package br.com.combinado.atividade;

public class CombinadoEstrutura3 {
	
	public static void main(String[] args) {
		int[] numeros = {51,31,54,5874,};
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
