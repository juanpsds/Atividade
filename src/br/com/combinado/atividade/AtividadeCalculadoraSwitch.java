package br.com.combinado.atividade;

import java.util.Scanner;

public class AtividadeCalculadoraSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String  menu =" informe 0 para finalizar \n informe 1 para somar \n informe 2 para subtrair \n informe 3 para multiplicar \n informe 4 para dividir \n informe 5 para fazer o modulo  ";
		System.out.print(menu);
		int informarNumero = teclado.nextInt();
		while (informarNumero != 0) {
			System.out.print("informe o primeiro numero: ");
			int primeiroNumero = teclado.nextInt();
			System.out.print("informe o segundo numero: ");
			int segundoNumero = teclado.nextInt();
			switch (informarNumero) {
			case 1:
				int soma = primeiroNumero + segundoNumero;
				System.out.println(soma);
				break;
			case 2:
				int subtrair = primeiroNumero - segundoNumero;
				System.out.println(subtrair);
				break;
			case 3:
				int multiplicacao = primeiroNumero * segundoNumero;
				System.out.println(multiplicacao);
				break;
			case 4:
				int divisao = primeiroNumero / segundoNumero;
				System.out.println(divisao);
				break;
			case 5:
				int modulo = primeiroNumero % segundoNumero;
				System.out.println(modulo);
				break;
			default:
				System.out.println("numero invalido");
				break;
			}

			System.out.print(menu);
			informarNumero = teclado.nextInt();

		}
		System.out.println("fim");
		teclado.close();

	}

}
