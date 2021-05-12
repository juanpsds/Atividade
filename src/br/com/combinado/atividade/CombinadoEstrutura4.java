package br.com.combinado.atividade;

public class CombinadoEstrutura4 {
	
	public static void main(String[] args) {
		int[] numeros = {9,8,7,6,5,4,3,2,1,};
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
			System.out.print(i);
		}
	}

}
