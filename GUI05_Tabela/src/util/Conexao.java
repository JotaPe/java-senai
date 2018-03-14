package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url; // Local do Banco de Dados.
	private String driver; // Classe Java do Framework que foi baixado na web.
	private String login; // Login do usu�rio no SGBD.
	private String senha; // Senha do usu�rio no SGBD.

	public Conexao(String url, String driver, String login, String senha) {
		try {

			this.url = url;
			this.driver = driver;
			this.login = login;
			this.senha = senha;
			// registro da Classe de driver na conex�o atrav�s de JDBC.
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}// fim do conexao()

	public Connection obterConexao() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, login, senha);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}//fim do obterConexao()

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







