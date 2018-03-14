package controller;

import model.Endereco;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario usu = new Usuario();
		usu.matricula = 1;
		usu.login = "joao";
		usu.senha = "abcd";
		usu.nome = "João com \"Alface\"";
		usu.email = "joao@email.com";
		usu.telefone = "(21) 2222-3456";
		
		Endereco end = new Endereco();
		end.logradouro = "Rua São Francisco Xavier";
		end.numero = "417";
		end.complemento = "APTO 509";
		end.bairro = "Tijuca";
		end.cidade = "Rio de Janeiro";
		end.estado = "RJ";
		end.cep = "20550-010";
		
		Notebook n1 = new Notebook();
		n1.numeroNote = 101;
		n1.modelo = "HP N1";
		n1.descricao = "CPU i3, 2GB, 320GB";
		n1.estoque = 15;
		n1.precoUnitario = 1000.00;
		n1.figura = "C:\\imagens\\hpn1.jpg";
		n1.dataCadastro = "04/11/2014";
		
		Notebook n2 = new Notebook();
		n2.numeroNote = 102;
		n2.modelo = "HP N2";
		n2.descricao = "CPU i5, 4GB, 500GB";
		n2.estoque = 6;
		n2.precoUnitario = 2000.00;
		n2.figura = "C:\\imagens\\hpn2.jpg";
		n2.dataCadastro = "04/11/2014";
		
		Notebook n3 = new Notebook();
		n3.numeroNote = 103;
		n3.modelo = "HP N3";
		n3.descricao = "CPU i7, 8GB, 1TB";
		n3.estoque = 8;
		n3.precoUnitario = 3000.00;
		n3.figura = "C:\\imagens\\hpn3.jpg";
		n3.dataCadastro = "04/11/2014";
		
		ItemDePedido it1 = new ItemDePedido();
		//2 notebooks do obj n1
		it1.qtde = 2;
		it1.subtotal = 2000.00; //2 x 1000
		
		ItemDePedido it2 = new ItemDePedido();
		//1 notebook do obj n3
		it2.qtde = 1;
		it2.subtotal = 3000.00; 
		
		Pedido p1 = new Pedido();
		p1.numero = 3425245;
		p1.dataEmissao = "04/11/2014";
		p1.formaDePagamento = "Cartão Visa 10x";
		p1.valorTotal = 5000.00; //2000 do it1 + 3000 do it2
		p1.situacao = "Aguardando confirmação da operadora de cartões";
		
		System.out.println("Exibindo os objetos:");
		System.out.println();//pular linha
		
		System.out.println("Objeto usu:");
		System.out.println("Matrícula: " + usu.matricula);
		System.out.println("Login: " + usu.login);
		System.out.println("Senha: " + usu.senha);
		System.out.println("Nome: " + usu.nome);
		System.out.println("E-mail: " + usu.email);
		System.out.println("Telefone: " + usu.telefone);
		System.out.println();//pular linha
		
		System.out.println("Objeto end:");
		System.out.println("Logradouro" + end.logradouro);
		System.out.println("Número: " + end.numero);
		System.out.println("Complemento: " + end.complemento);
		System.out.println("Bairro" + end.bairro);
		System.out.println("Cidade: " + end.cidade);
		System.out.println("Estado: " + end.estado);
		System.out.println("CEP: " + end.cep);
		System.out.println();//pular linha
		
		System.out.println("Objeto n1:");
		System.out.println("Número do Note:" + n1.numeroNote);
		System.out.println("Modelo: " + n1.modelo);
		System.out.println("Descrição: " + n1.descricao);
		System.out.println("Estoque: " + n1.estoque);
		System.out.println("Preço Unitário: " + n1.precoUnitario);
		System.out.println("Figura: " + n1.figura);
		System.out.println("Data de Cadastro: " + n1.dataCadastro);
		System.out.println();//pular linha
		
		System.out.println("Objeto n2:");
		System.out.println("Número do Note:" + n2.numeroNote);
		System.out.println("Modelo: " + n2.modelo);
		System.out.println("Descrição: " + n2.descricao);
		System.out.println("Estoque: " + n2.estoque);
		System.out.println("Preço Unitário: " + n2.precoUnitario);
		System.out.println("Figura: " + n2.figura);
		System.out.println("Data de Cadastro: " + n2.dataCadastro);
		System.out.println();//pular linha
		
		System.out.println("Objeto n3:");
		System.out.println("Número do Note:" + n3.numeroNote);
		System.out.println("Modelo: " + n3.modelo);
		System.out.println("Descrição: " + n3.descricao);
		System.out.println("Estoque: " + n3.estoque);
		System.out.println("Preço Unitário: " + n3.precoUnitario);
		System.out.println("Figura: " + n3.figura);
		System.out.println("Data de Cadastro: " + n3.dataCadastro);
		System.out.println();//pular linha
		
		System.out.println("Objeto it1");
		System.out.println("Quantidade: " + it1.qtde);
		System.out.println("Subtotal: R$ " + it1.subtotal);
		System.out.println();//pular linha
		
		System.out.println("Objeto it2");
		System.out.println("Quantidade: " + it2.qtde);
		System.out.println("Subtotal: R$ " + it2.subtotal);
		System.out.println();//pular linha
		
		System.out.println("Objeto p1:");
		System.out.println("Número: " + p1.numero);
		System.out.println("Data de Emissão: " + p1.dataEmissao);
		System.out.println("Forma de Pagamento: " + p1.formaDePagamento);
		System.out.println("Valor total: R$" + p1.valorTotal); 
		System.out.println("Situação: " + p1.situacao);
			
	}
}
