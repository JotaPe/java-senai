package model;

public class Usuario {

	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	// Construtor padrão de Classe.
	// Objeto vazio para o momento que o usuário ainda não cadastrou dados.
	public Usuario() {
		super();
		// super faz referência à super classe.
		// Toda classe java é sub classe da classe Object.
	}

	// Construtor com atributos da Classe. Será utilizado para o usuário
	// efetuar o cadastro.
	public Usuario(int matricula, String login, String senha, String nome,
			String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void mostrar() {
		// Mostrar usuário
		System.out.println("\n\nUsuário:\n");
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

}
