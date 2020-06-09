package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Bancodedados;

public class livrosDAO {

	private Connection connection;
	private static livrosDAO dao;

	
	public livrosDAO()  throws Exception {}
	
	
	public void openConnectio() throws Exception {

		try {

			connection = Bancodedados.getConnection();

		} catch (Exception e) {
			System.out.println("erro"+e);
			throw e;
		}

	}
	
	
	
	public static livrosDAO getInstance() throws Exception {
		if(dao == null) {
			dao = new livrosDAO();
		}
		dao.openConnectio();
		return dao;
	}
	 
	
	
	public void salvar(Livros l) throws Exception{

		try {
			String sql =  "INSERT INTO livros (nome, altor,descricao) values (?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, l.getNome());
			stmt.setString(2,l.getAltor());
			stmt.setString(3,l.getDescricao());
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao salvar um contato");
		}

	}

	public List<Livros> buscarContatos() throws Exception {
		try {
			List<Livros> Li = new ArrayList<>();
			String sql = "SELECT * FROM livros ORDER BY nome ASC";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			
			while (rs.next()) {
				Livros livro = new Livros();
				livro.setID(rs.getInt("ID"));
				livro.setNome(rs.getString("nome"));
				livro.setAltor(rs.getString("altor"));
				livro.setDescricao(rs.getString("descricao"));
				Li.add(livro);
			}
			rs.close();
			return Li;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao buscar os contatos.");
		}
	}

}
