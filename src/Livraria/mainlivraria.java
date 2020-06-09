package Livraria;

import java.util.ArrayList;
import java.util.List;

import model.Livros;
import model.livrosDAO;

public class mainlivraria {

	public static void main(String[] args) {
	
//		           class para testar a conexão
		try {
			
			List<Livros> aa = new ArrayList<>();
			
			livrosDAO d= livrosDAO.getInstance();
			
			Livros l = new Livros();
		 
			
			
			
			// ||Salvar|| 
//			l.setNome("Trindade");
//			l.setDescricao("Trindade");
//			l.setAltor("Trindade");
//     		d.salvar(l);
		 
//     		 ||Listar os livros|| 
//	        aa =   d.buscarContatos();	
	        
	        
	        //||Deletar o livro
	       // d.deletar(1);
	        
			//|| atualizadar livros
//			
//			l.setNome("GTA");
//			l.setDescricao("Trindade");
//			l.setAltor("AAAA");
//			l.setID(4);
//			
//	        d.atualizar(l);
//	        
	        
			
	        
           System.out.println("nome:"+aa.get(0).getNome());
           System.out.println("descrição:"+aa.get(0).getDescricao());
           System.out.println("ID:"+aa.get(0).getID());
           System.out.println("altor:"+aa.get(0).getAltor());
           
           
           
           
		} catch (Exception e) {
			System.out.println("ERRO menu:"+e);
			e.printStackTrace();
		}
		
	
		
	}

}
