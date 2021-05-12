package br.com.combinado.atividade;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(
				" informe 0 para finalizar \n informe 1 para somar \n informe 2 para subtrair \n informe 3 para multiplicar \n informe 4 para dividir \n informe 5 para fazer o modulo  ");
		int informarNumero = teclado.nextInt();
		System.out.print("informe o primeiro numero: ");
		int primeiroNumero = teclado.nextInt();
		System.out.print("informe o segundo numero: ");
		int segundoNumero = teclado.nextInt();
		int soma = primeiroNumero + segundoNumero;
		int subtrair = primeiroNumero - segundoNumero;
		int multiplicacao = primeiroNumero * segundoNumero;
		int divisao = primeiroNumero / segundoNumero;
		int modulo = primeiroNumero % segundoNumero;
		while (informarNumero >= 0 && informarNumero <= 5) {
			if (informarNumero == 0) {
				System.out.println("finalizar");
			} else if (informarNumero == 1) {
				System.out.println(soma);
			} else if (informarNumero == 2) {
				System.out.println(subtrair);
			} else if (informarNumero == 3) {
				System.out.println(multiplicacao);
			} else if (informarNumero == 4) {
				System.out.println(divisao);
			} else if (informarNumero == 5)
				System.out.println(modulo);
			} 
		System.out.print("~fim~");
		teclado.close();
		}

	}

