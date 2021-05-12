package br.com.combinado.atividade;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		int aprovados = 0;
		int recuperacao = 0;
		int reprovados = 0;
		int quantidade = 0;
		int total = 0;
		int maior = 0;
		int menor = 100;
		int media = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("deseja informar uma nota: ");
		boolean informarNota = teclado.nextBoolean();
		while (informarNota) {
			System.out.print("informe a nota: ");
			int nota = teclado.nextInt();
			if (nota >= 0 && nota <= 100) {
				quantidade++;
				total += 1;
				if (nota >= 60) {
					aprovados++;
					System.out.println("aprovado");
				} else if (nota >= 40) {
					recuperacao++;
					System.out.println("recuperaçao");
				} else {
					reprovados++;
					System.out.println("reprovado");
				} 
				if (nota > maior) {
					maior = nota;
				}
				if (nota < menor) {
					menor = nota;
				}
				System.out.print("deseja informar novamente: ");
				informarNota = teclado.nextBoolean();
			} else {
				System.out.println("nota invalida");
			}
			if (informarNota) {
				media = total / quantidade;
			} else {
				menor = 0;
			}
		}
		System.out.println("a quantidade de alunos aprovados e de " + aprovados);
		System.out.println("a quantidade de alunos reprovados e de " + recuperacao);
		System.out.println("a quantidade de alunos em recuperação e de " + reprovados);
		System.out.println("a quantidade de alunos que informados e de " + quantidade);
		System.out.println("a maior nota e de " + maior);
		System.out.println("a menor nota e de  " + menor);
		System.out.println("a media das notas e " + media);
		teclado.close();
	}

}
