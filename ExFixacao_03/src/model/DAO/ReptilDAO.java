package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Reptil;
import util.Conexao;

public class ReptilDAO {
	
	public static Reptil inserir(String nomenclatura, int numeroDePatas, 
			String cobertoPor, String reproducao, String alimentacao, 
			boolean capacidadeRegenerativa) {
		Reptil reptil = null;
		

		try {
			// Criação do insert
			String sql = "insert into reptil "
					+ "(capacidaderegenerativa, fknomenclatura) "
					+ "values (?,?)";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setBoolean(1, capacidadeRegenerativa);
			comando.setString(2, nomenclatura);
			
			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		reptil = new Reptil(nomenclatura, numeroDePatas, cobertoPor,
				reproducao, alimentacao, capacidadeRegenerativa);

		return reptil;
	}
	
	public static Reptil[] visualizarRepteis() {
		Reptil[] repteis = null;

		try {
			// Criação do select
			String sql = "select a.*, r.capacidaderegenerativa " +
					"from animal as a, reptil as r " +
					"where (a.nomenclatura = r.fknomenclatura) " +
					"group by a.nomenclatura";

			// Obter a conexao com o bd
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			Connection con = conex.obterConexao();

			/*
			 * Executa a confirmação direta de acesso ao bd pois não são
			 * necessárias informações para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();

			/*
			 * ResultSet - Classe java que monta em memória uma matriz com a
			 * resposta das linhas do bd
			 */
			ResultSet rs = comando.executeQuery(sql);

			// vetor de objetos
			repteis = new Reptil[20];

			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos
			 * (uma linha de dados da matriz do ResultSet é copiada para um
			 * objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				repteis[i++] = new Reptil(
						rs.getString("nomenclatura"),
						rs.getInt("numeroDePatas"), 
						rs.getString("cobertoPor"),
						rs.getString("reproducao"),
						rs.getString("alimentacao"),
						rs.getBoolean("capacidadeRegenerativa"));
			}

			// É necessário encerrar o acesso ao bd para liberar a conexão
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return repteis;
	}
	
	public static Reptil alterarReptil(int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao, boolean capacidadeRegenerativa, 
			String nomenclatura) {
		Reptil reptil = null;
		try {
			// Criação do update na tabela Animal
			String sql1 = "update animal set " +
					"numerodepatas = ?, " +
					"cobertopor = ?, " +
					"reproducao = ?, " +
					"alimentacao = ? " +
					"where nomenclatura = ?";
			
			// Criação do update na tabela reptil
			String sql2 = "update reptil set " +
					"capacidaderegenerativa = ? " +
					"where fknomenclatura = ?";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando1 = con.prepareStatement(sql1);
			PreparedStatement comando2 = con.prepareStatement(sql2);

			comando1.setInt(1, numeroDePatas);
			comando1.setString(2, cobertoPor);
			comando1.setString(3, reproducao);
			comando1.setString(4, alimentacao);
			comando1.setString(5, nomenclatura);
			
			comando2.setBoolean(1, capacidadeRegenerativa);
			comando2.setString(2, nomenclatura);

			// Comando executado
			comando1.executeUpdate();
			comando2.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return reptil;

	}
	
	
	public static Reptil excluirReptil(String nomenclatura) {
		Reptil reptil = null;
		try {
					
			// Criação do delete para a tabela réptil
			String sql1 = "delete from reptil where fknomenclatura = ?";
			
			// Criação do delete para a tabela animal
			String sql2 = "delete from animal where nomenclatura = ?";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando1 = con.prepareStatement(sql1);
			PreparedStatement comando2 = con.prepareStatement(sql2);

			comando1.setString(1, nomenclatura);
			comando2.setString(1, nomenclatura);

			// Comando executado
			comando1.executeUpdate();
			comando2.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return reptil;

	}
}
