package controller;

import util.Teclado;

public class ExemploEntrada {

	public static void main(String[] args) {

		// Leitura de texto
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");

		// Leitura de inteiro
		int idade;
		idade = Teclado.lerInt("Digite sua idade: ");

		// Leitura de Ponto Flutuante
		double salario;
		salario = Teclado.lerDouble("Digite seu salário: ");

		System.out.println("Nome informado : " + nome);
		System.out.println("Idade informada : " + idade);
		System.out.println("Salário informado : " + salario);

	}

}
