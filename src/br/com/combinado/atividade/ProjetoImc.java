package br.com.combinado.atividade;

import java.util.Scanner;

public class ProjetoImc {

	public static float calcularImc(float peso, float altura) {
		float imc = peso / (altura * altura);
		return imc;
	}

	public static void exibirInformacoesPessoas(String[] nomes, float[] pesos, float[] alturas, String msg) {
		System.out.println(msg);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(i + "	" + nomes[i] + "	" + alturas[i] + "	" + pesos[i]);
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantas pessoas vao ser cadastradas: ");
		int qtdPessoas = teclado.nextInt();
		teclado.nextLine();
		String[] nomes = new String[qtdPessoas];
		float[] pesos = new float[qtdPessoas];
		float[] alturas = new float[qtdPessoas];
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.print("Qual seu nome: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Qual seu peso: ");
			pesos[i] = teclado.nextFloat();
			System.out.print("Qual sua altura: ");
			alturas[i] = teclado.nextFloat();
			teclado.nextLine();
		}
		String menu = "0 - Finalizar \n1 - Calcular IMC \n2 - Alterar a altura \n3 - Alterar peso\n4 - Exibir todas as pessoas \n=> ";
		System.out.print(menu);
		int opcao = teclado.nextInt();
		int indice = 0;
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				exibirInformacoesPessoas(nomes, pesos, alturas, "qual indice voce deseja calcular de IMC: ");
				indice = teclado.nextInt();
				float imc = calcularImc(pesos[indice], alturas[indice]);
				System.out.println("su IMC é de " + imc);
				break;
			case 2:
				exibirInformacoesPessoas(nomes, pesos, alturas, "Qual indice voce deseja trocar a altura: ");
				indice = teclado.nextInt();
				System.out.println("Qual a nova altura");
				alturas[indice] = teclado.nextFloat();
				break;
			case 3:
				exibirInformacoesPessoas(nomes, pesos, alturas, "Qual indice voce deseja trocar o peso: ");
				indice = teclado.nextInt();
				System.out.println("qual o novo peso: ");
				pesos[indice] = teclado.nextFloat();
				break;
			case 4:
				for (int i = 0; i < qtdPessoas; i++) {
					System.out.println(nomes[i] + "	" + alturas[i] + "	" + pesos[i] + " e o IMC é "
							+ calcularImc(pesos[i], alturas[i]));
				}
				break;
			default:
				System.out.println("OPÇAO INVALIDA");
				break;
			}
			System.out.print(menu);
			opcao = teclado.nextInt();
		}
		System.out.println("FIM ;) :~) :=) :> :! :/ :-) :} :(");
		teclado.close();
	}

}
