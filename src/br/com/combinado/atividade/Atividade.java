package br.com.combinado.atividade;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantas pessoas vao ser cadastrada: ");
		int qtdPessoas = teclado.nextInt();
		teclado.nextLine();
		String[] nomes = new String[qtdPessoas];
		float[] pesos = new float[qtdPessoas];
		float[] alturas = new float[qtdPessoas];
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.print("Informe o nome: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe o peso: ");
			pesos[i] = teclado.nextFloat();
			System.out.print("Informe a altura: ");
			alturas[i] = teclado.nextFloat();
			teclado.nextLine();
		}
		String menu = (" informe /n 0 para finalizar \n 1 para calcular imc \n 2 para mudar altura \n 3 para mudar peso");
		System.out.println(menu);
		int opcao = teclado.nextInt();
		int indice = 0;
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.print("Qual a pessoa voce deseja calcular o imc: " + "\n");
				teclado.nextLine();
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i]);
				}
				indice = teclado.nextInt();
				float imc = pesos[indice] /(alturas[indice] * alturas[indice]);
				System.out.println("seu imc é " + imc);
				break;
			case 2:
				System.out.print("Qual a pessoa voce deseja alterar a altura: " + "\n");
				teclado.nextLine();
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i]);
				}
				indice = teclado.nextInt();
				System.out.print("informe a nova altura do " + nomes[indice] + ": ");
				alturas[indice] = teclado.nextFloat();
				break;
			case 3:
				System.out.print("Qual a pessoa voce deseja alterar o peso: " + "\n");
				teclado.nextLine();
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i]);
				}
				indice = teclado.nextInt();
				System.out.println("informe o novo peso " + nomes[indice] + ": ");
				pesos[indice] = teclado.nextFloat();
				break;
			default:
				break;
			}
		}
		System.out.println(nomes[indice]);
		System.out.println(alturas[indice]);
		System.out.println(pesos[indice]);
		teclado.close();
	}

}
