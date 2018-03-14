package controller;

public class SobrecargaMetodo {

	int idade;
	String nome;

	public static void main(String[] args) {

		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(28);
		scm.cadastrarPessoa("Michael Ferreira");
		scm.cadastrarPessoa(35, "Fabrício Gomes");
		

	}// fim do método main

	public void cadastrarPessoa(int valor) {
		idade = valor;
		System.out.println("Idade: " + idade);
	}

	public void cadastrarPessoa(String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	}

	public void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " – Nome: " + nome);
	}
	
	public void cadastrarPessoa(String valor1, int valor2) {
		idade = valor2;
		nome = valor1;
		System.out.println("Idade: " + idade + " – Nome: " + nome);
	}

}// fim da classe



















