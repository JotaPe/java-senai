package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Funcionario;
import util.Conexao;
import util.Configurador;

public class FuncionarioDAO {
	
	Configurador config = new Configurador();

	String url;
	String driver;
	String login;
	String senha;

	public FuncionarioDAO() {

		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();
	}
	
	public static Funcionario buscarPorLoginSenha(String login, String senha) {
		Funcionario funcionario = null;

		FuncionarioDAO funcDAO = new FuncionarioDAO();
		try {
			// Criação do insert
			String sql = "select * from usuario u, funcionario f "
					+ "where u.login= ? and u.senha = ?";

			// Obter a conexão com o BD
			Conexao conex = new Conexao(funcDAO.url, funcDAO.driver,
					funcDAO.login, funcDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, login);
			comando.setString(2, senha);

			ResultSet rs = comando.executeQuery();

			if (rs.next()) {
				funcionario = new Funcionario(
						rs.getString("login"),
						rs.getString("senha"), 
						rs.getInt("tipo"),
						rs.getString("matricula"));
			}

			rs.close();
			comando.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return funcionario;
	}
}
