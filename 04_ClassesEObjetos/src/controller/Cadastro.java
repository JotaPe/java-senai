package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Produto;

public class Cadastro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.fabricante = "Volkswagen";
		c1.modelo = "Gol";
		c1.cor = "Preto";
		c1.ano = 2014;
		
		Carro c2 = new Carro();
		c2.fabricante = "Fiat";
		c2.modelo = "Palio";
		c2.cor = "Branco";
		c2.ano = 2010;
		
		Carro c3 = new Carro();
		c3.fabricante = "Citroen";
		c3.modelo = "C3";
		c3.cor = "Vermelho";
		c3.ano = 2013;
		
		Funcionario f1 = new Funcionario();
		f1.matricula = 1;
		f1.nome = "Robson Cruzoé";
		f1.cpf = "111.222.333-44";
		
		Funcionario f2 = new Funcionario();
		f2.matricula = 2;
		f2.nome = "Lara Croft";
		f2.cpf = "112.223.334-45";
		
		Funcionario f3 = new Funcionario();
		f3.matricula = 3;
		f3.nome = "Chaves del Ocho";
		f3.cpf = "114.225.336-47";
		
		Livro l1 = new Livro();
		l1.isbn = 12345;
		l1.nome = "O Monge e o Executivo";
		l1.autor = "Esqueci o nome do autor";
		l1.editora = "Edita Tudo";
		
		Livro l2 = new Livro();
		l2.isbn = 45678;
		l2.nome = "Meu Pé de Laranja Lima";
		l2.autor = "O Cara";
		l2.editora = "ABC";
		
		Livro l3 = new Livro();
		l1.isbn = 87654;
		l1.nome = "Java Avançado";
		l1.autor = "Nerd Paca";
		l1.editora = "Novatec";
		
		Produto p1 = new Produto();
		p1.idProduto = 101;
		p1.nomenclatura = "Coca-Cola";
		p1.descricao = "Refrigerante";
		p1.quantidade = 300;
		
		Produto p2 = new Produto();
		p2.idProduto = 102;
		p2.nomenclatura = "Babaloo";
		p2.descricao = "Chiclete";
		p2.quantidade = 48;
		
		Produto p3 = new Produto();
		p3.idProduto = 103;
		p3.nomenclatura = "Moto G";
		p3.descricao = "Celular";
		p3.quantidade = 20;
		
		
	
		
		

	}

}
