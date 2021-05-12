package br.com.combinado.atividade;

public class CombinadoEstrutura7 {
	
	public static void main(String[] args) {
		int[] numeros = {12,36,20,45,1,20,6,00,8,529,30,5,};
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j]= aux;
				}
			}
		}
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
