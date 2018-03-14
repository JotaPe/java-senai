package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		
		//Cadastro de 8 alunos
		
		Aluno a1 = new Aluno("Ana Carolina", "(21)3333-6543", 
				"034.444.555-98", "10/02/1998", 1);
		
		Aluno a2 = new Aluno("Antônio Rodrigo", "(21)6543-3333", 
				"034.568.555-18", "10/03/1997", 2);
		
		Aluno a3 = new Aluno("Bianca Barreto", "(21)2651-3000", 
				"948.569.002-34", "10/04/1999", 3);
		
		Aluno a4 = new Aluno("Bruno Borges", "(21)95678-2887", 
				"123.456.789-00", "10/05/2000", 4);
		
		Aluno a5 = new Aluno("Caio Vinícius", "(21)98444-4455", 
				"098.765.432-10", "10/06/2001", 5);
		
		Aluno a6 = new Aluno("Clara Thompson", "(21)77665-1234", 
				"567.789.123-45", "10/07/2000", 6);
		
		Aluno a7 = new Aluno("Daniel Letiere", "(21)55532-2456", 
				"234.456.678-89", "10/08/1998", 7);
		
		Aluno a8 = new Aluno("Gabriella Silva", "(21)3691-3344", 
				"876.654.432-21", "10/09/2002", 8);
		
		//Utilizando o construtor com entrada apenas para nome e matrícula
		Aluno a9 = new Aluno("Isaque Souza", 9);
		//Cadastrando os valores que ficaram faltando em "a9"
		a9.setTelefone("(21)2345-5432");
		a9.setCpf("123.234.456-12");
		a9.setDataNascimento("14/06/2000");
		
		//Cadastro de 3 professores
		Professor p1 = new Professor ("Jorge Roberto", "(21)99887-0001",
				2345, "21/09/1932");
		
		Professor p2 = new Professor ("Vicente Silva", "(21)87761-0002",
				2346, "15/10/1965");
		
		Professor p3 = new Professor ("Padilha", "(21)2214-0003",
				2347, "15/02/1915");
		
		//Exibir os valores dos objetos - utilizando o método mostrar()
		a1.mostrar();
		a2.mostrar();
		a3.mostrar();
		a4.mostrar();
		a5.mostrar();
		a6.mostrar();
		a7.mostrar();
		a8.mostrar();
		a9.mostrar();
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
		//Exibindo apenas a matrícula do objeto a1
		System.out.println("Matrícula do a1: " + a1.getMatricula());

	}

}
