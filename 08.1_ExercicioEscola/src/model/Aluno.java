package model;

public class Aluno {
	
	private String nome;
	private String telefone;
	private String cpf;
	private String dataNascimento;
	private int matricula;
	
	//Construtor padrão (simples) - Só cria objetos vazios
	public Aluno() {
		super();
	}
	
	//Construtor completo - Cria objetos com todos os atributos já preenchidos
	public Aluno(String nome, String telefone, String cpf,
			String dataNascimento, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
	}
	
	
	//Construtor só com atributos nome e matricula 
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	/*
	 * Métodos get e set servem para que os valores dos atributos da 
	 * classe (que são privados) possam ser utilizados em outras classes.
	 * get - Leva o valor do atributo à classe de destino
	 * set - Insere valor no atributo na classe de origem (esta aqui)
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	public void mostrar(){
		
		System.out.println("\nAluno:\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Matrícula: " + this.matricula + "\n");

	}
}
