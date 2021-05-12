package br.com.combinado.atividade;

import java.util.Scanner;

public class AtividadeMuitoDificel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantas pessoas vão ser cadastradas: ");
		int qtdPessoas = teclado.nextInt();
		teclado.nextLine();
		String[] nomes = new String[qtdPessoas];
		float[] pesos = new float[qtdPessoas];
		float[] alturas = new float[qtdPessoas];
		for (int i = 0; i < alturas.length; i++) {
			System.out.print("Informe o nome: ");
			nomes[i] = teclado.nextLine();
			System.out.print("informe o peso: ");
			pesos[i] = teclado.nextFloat();
			System.out.print("informe a altura: ");
			alturas[i] = teclado.nextFloat();
			teclado.nextLine();
		}
		String menu = ("0 - Finalizar \\n1 - Calcular IMC \\n2 - Alterar a altura \\n3 - Alterar peso\\n4 - Exibir todas as pessoas \\n=> ");
		System.out.print(menu);
		int opcao = teclado.nextInt();
		int indice = 0;
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("Qual o indice da pessoa voce deseja calcular IMC: ");
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i] + " - " + alturas[i] + " - " + pesos[i]);
				}
				indice = teclado.nextInt();
				float imc = pesos[indice] / (alturas[indice] * alturas[indice]);
				System.out.println("O indice de massa corporal do " + nomes[indice] + " é: " + imc);
				break;
			case 2:
				System.out.println("Qual indice voce alterar a altura: ");
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i] + " - " + alturas[i] + " - " + pesos[i]);
				}
				indice = teclado.nextInt();
				System.out.println("Altura atual " + alturas[indice] + ", informe a nova altura: ");
				alturas[indice] = teclado.nextFloat();
				break;
			case 3:
				System.out.println("Qual o indice voce deseja alterar o peso: ");
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i] + " - " + alturas[i] + " - " + pesos[i]);
				}
				indice = teclado.nextInt();
				System.out.println("Peso atual " + pesos[indice] + ", informe o novo peso: ");
				pesos[indice] = teclado.nextFloat();
				break;
			case 4:
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(i + "\t" + nomes[i] + " - " + alturas[i] + " - " + pesos[i]);
				}
				break;
			default:
				System.out.println("opção invalida");
				break;
			}
			System.out.println(menu);
			opcao = teclado.nextInt();
		}
		System.out.println("FIM ;]");
		teclado.close();
	}

}
