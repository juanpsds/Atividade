package br.com.combinado.atividade;

public class CombinadoEstrutura6 {
	
	public static void main(String[] args) {
		int[] numeros = {12,50,2,02,90,45,30,7,95,100,3};
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
