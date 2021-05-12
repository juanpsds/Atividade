package br.com.combinado.atividade.calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o primeiro numero");
		int primeiroNumero = teclado.nextInt();
		System.out.println("digite o segundo numero");
		int segundoNumero = teclado.nextInt();
		Calc batmam = new Calc();
		System.out.println(batmam.somar(primeiroNumero, segundoNumero));
		teclado.close();
	}

}
