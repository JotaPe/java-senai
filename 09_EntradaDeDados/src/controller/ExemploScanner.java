package controller;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		
		/*
		 * A Classe Scanner possui falhas. 
		 * Neste exemplo, ao digitar o nome completo, perde-se 
		 * o que está após o espaço.
		 */
		
		String nome;

		System.out.println("Digite seu nome:");
		Scanner sc = new Scanner(System.in);
		nome = sc.next();

		System.out.println("Nome Digitado: " + nome);
		
		
		/*
		 * Outra falha da Classe Scanner: Ao tentar inserir um número
		 * decimal (ex 3500.50) acontece um erro.
		 */
		double salario;
		
		//Tudo que a Classe Scanner captura do teclado vem como String
		System.out.println("Digite o Salário que deseja: ");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();//converter de String p double
		
		System.out.println("Salário Pretendido: " + salario);


		

	}

}
