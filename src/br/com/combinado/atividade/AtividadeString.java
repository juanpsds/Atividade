package br.com.combinado.atividade;

import java.util.Scanner;

public class AtividadeString {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("digite seu nome completo: ");
		String nome = teclado.nextLine();
		char primeiraLetra = nome.charAt(0);
		System.out.println(primeiraLetra);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		int tamanhoNome = nome.length();
		System.out.println(tamanhoNome);
		int primeiroEspaco = nome.indexOf(" ");
		if (primeiroEspaco >= 0) {
			System.out.println(nome.substring(0, primeiroEspaco));
		} else {
			System.out.println(nome);
		}
		System.out.println(nome.charAt(tamanhoNome - 1));
		int indiceUltimoEspaco = nome.lastIndexOf(" ");
		if (indiceUltimoEspaco >= 0) {
		System.out.println(nome.substring(indiceUltimoEspaco + 1));
		} else {
			System.out.println(nome);
		}
		teclado.close();
	}

}
