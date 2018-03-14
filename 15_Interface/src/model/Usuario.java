package model;

public abstract class Usuario {//abstract = Classe abstrata
	
	private String login;
	private String senha;
	private int tipo;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Usuario() {
		super();
	}
	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	//método abstrato
	public abstract void mostrar();
	
	

}
