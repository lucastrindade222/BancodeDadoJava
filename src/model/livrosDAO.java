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
			String sql =  "INSERT INTO livros (nome, autor,descricao,Valor) values (?, ?, ?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, l.getNome());
			stmt.setString(2,l.getAutor());
			stmt.setString(3,l.getDescricao());
			stmt.setString(4, l.getValor());
			
			System.out.println("Livro Salvo com sucesso!!!");
			
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao salvar um contato");
		}

	}

	public List<Livros> buscarContatos() throws Exception {
		try {
			List<Livros> Li = new ArrayList<>();
			String sql = "SELECT * FROM livros ORDER BY ID ASC";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			
			while (rs.next()) {
				Livros livro = new Livros();
				livro.setID(rs.getInt("ID"));
				livro.setNome(rs.getString("nome"));
				livro.setAutor(rs.getString("autor"));
				livro.setDescricao(rs.getString("descricao"));
				livro.setValor(rs.getString("Valor"));
				Li.add(livro);
			}
			
			
			rs.close();
			return Li;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao buscar os contatos.");
		}
	}
	
	
	
	
public void atualizar(Livros livros) {
		
		
		try {
			String sql="UPDATE livros SET  nome=?,autor=?,descricao=?,Valor=? WHERE ID=?;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			
			stmt.setString(1, livros.getNome());
			stmt.setString(2,livros.getAutor());
			stmt.setString(3,livros.getDescricao());
			stmt.setString(4, livros.getValor());
			stmt.setInt(5, livros.getID());
			System.out.println("O livro foi atualzado.");
			stmt.execute();
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	public void deletar(Integer ID) {
		
		
		try {
			String sql= "DELETE FROM  livros WHERE  ID="+ID+"";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.execute();
			
			System.out.println("Livor com o ID:"+ID+",foi deletado.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	

}
