package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url; // Local do BD
	private String driver; // Classe Java do Framework que foi baixado na web
	private String login; // Login do usu�rio SGBD
	private String senha; // Senha do usu�rio no SGBD

	public Conexao(String url, String driver, String login, String senha) {
		try {

			this.url = url;
			this.driver = driver;
			this.login = login;
			this.senha = senha;
			Class.forName(driver);
			// registro da Classe de driver na conex�o atrav�s de JDBC

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Connection obterConexao(){
		Connection con = null;
		try{
			con = DriverManager.getConnection(url, login, senha);
		} catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return con;
	}

	public String getDriver() {
		return driver;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	
}
