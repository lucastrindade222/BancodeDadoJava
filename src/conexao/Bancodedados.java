package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bancodedados {

	
	
	public static Connection getConnection() throws Exception {
		try {
			 
			Connection connection = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "lsvlk1408");
			return connection;
			
		} catch (SQLException e) {
			System.out.println("erri"+e);
			throw new Exception("Erro ao abrir conexão com o banco de dados.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
