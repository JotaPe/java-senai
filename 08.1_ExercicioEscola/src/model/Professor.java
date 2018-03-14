package model;

public class Professor {
	
	private String nome;
	private String telefone;
	private int registroFuncional;
	private String dataNascimento;
	
	public Professor() {
		super();
	}

	public Professor(String nome, String telefone, int registroFuncional,
			String dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.registroFuncional = registroFuncional;
		this.dataNascimento = dataNascimento;
	}

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

	public int getRegistroFuncional() {
		return registroFuncional;
	}

	public void setRegistroFuncional(int registroFuncional) {
		this.registroFuncional = registroFuncional;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void mostrar(){
		System.out.println("\nProfessor:\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Registro Funcional: " + this.registroFuncional);
		System.out.println("Data de Nascimento: " + this.dataNascimento + "\n");
				
	}

}
