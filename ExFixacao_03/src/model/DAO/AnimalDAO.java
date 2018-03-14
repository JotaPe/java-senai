package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Animal;
import util.Conexao;

public class AnimalDAO {
	
	public static Animal inserir(String nomenclatura, int numeroDePatas, 
			String cobertoPor, String reproducao, String alimentacao) {
		
		Animal animal = null;
		try {
			// Cria��o do insert
			String sql = "insert into animal (nomenclatura, numerodepatas," +
					" cobertopor, reproducao, alimentacao)" +
					" values (?,?,?,?,?)";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nomenclatura);
			comando.setInt(2, numeroDePatas);
			comando.setString(3, cobertoPor);
			comando.setString(4, reproducao);
			comando.setString(5, alimentacao);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		animal = new Animal(nomenclatura, numeroDePatas, cobertoPor,
				reproducao, alimentacao);
		
		return animal;

	}
	
	public static Animal[] visualizarAnimais() {
		Animal[] animais = null;

		try {
			// Cria��o do select
			String sql = "select * from animal";

			// Obter a conexao com o bd
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/exfixacao03_029",
					"com.mysql.jdbc.Driver", "root", "aluno");

			Connection con = conex.obterConexao();

			/*
			 * Executa a confirma��o direta de acesso ao bd pois n�o s�o
			 * necess�rias informa��es para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();

			/*
			 * ResultSet - Classe java que monta em mem�ria uma matriz com a
			 * resposta das linhas do bd
			 */
			ResultSet rs = comando.executeQuery(sql);

			// vetor de objetos
			animais = new Animal[20];

			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos
			 * (uma linha de dados da matriz do ResultSet � copiada para um
			 * objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				animais[i++] = new Animal(
						rs.getString("nomenclatura"),
						rs.getInt("numeroDePatas"), 
						rs.getString("cobertoPor"),
						rs.getString("reproducao"),
						rs.getString("alimentacao"));
			}

			// � necess�rio encerrar o acesso ao bd para liberar a conex�o
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return animais;
	}

}
