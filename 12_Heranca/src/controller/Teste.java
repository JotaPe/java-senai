package controller;

import model.Aluno;
import model.Pessoa;
import model.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Aluno alu = new Aluno("Lara Croft", "99999999-9", "777.887.975-67",
				"(21)98765-4321", "lara@email.com", "TI350", 
				"Técnico de Informática");
		
		Professor pr = new Professor("McGiver","10101010-1", 
				"887.876.576-61", "(21)97889-1234", "mc@email.com","PF01",
				"Banco de Dados");
		
		Pessoa pss = new Pessoa("Chuck Norris", "33344569-5", 
				"258.225.445-47", "(21)95541-0001", "cn@email.com");
		
		System.out.println("Valores cadastrados:\n");
		System.out.println("Aluno:");
		System.out.println("Nome:" + alu.getNome());
		System.out.println("RG:" + alu.getRg());
		System.out.println("CPF:" + alu.getCpf());
		System.out.println("Telefone:" + alu.getTelefone());
		System.out.println("E-mail:" + alu.getEmail());
		System.out.println("Matrícula:" + alu.getMatricula());
		System.out.println("Curso:" + alu.getCurso());
		
		System.out.println("\nProfessor:");
		System.out.println("Nome:" + pr.getNome());
		System.out.println("RG:" + pr.getRg());
		System.out.println("CPF:" + pr.getCpf());
		System.out.println("Telefone:" + pr.getTelefone());
		System.out.println("E-mail:" + pr.getEmail());
		System.out.println("Matrícula:" + pr.getMatricula());
		System.out.println("Segmento:" + pr.getSegmento());
		
		pss.mostrar();
		
		
		

	}

}
