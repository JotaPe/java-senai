package model;

public class Usuario {
	
	private String login;
	private String senha;
	
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
	public Usuario() {
		super();
	}
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}
	
}
