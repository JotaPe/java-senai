package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Usuario;
import util.Conexao;
import util.Configurador;

public class UsuarioDAO {
	
	Configurador config = new Configurador();
	
	String url;
	String driver;
	String login;
	String senha;
	
	public UsuarioDAO(){
		
		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();
	}
	
	public static Usuario inserir(String login, String senha, int tipo) {
		Usuario usuario = null;
		UsuarioDAO userDAO = new UsuarioDAO();
		
		try {
			// Criação do insert
			String sql = "insert into usuario (login, senha, tipo) values (?,?,?)";

			// Obter a conexão com o BD
			Conexao conex = new Conexao(userDAO.url, userDAO.driver,
					userDAO.login, userDAO.senha);

			// Abrir a conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, login);
			comando.setString(2, senha);
			comando.setInt(3, tipo);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return usuario;
	}

}
