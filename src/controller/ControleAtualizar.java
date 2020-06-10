package controller;

import model.Livros;
import model.livrosDAO;

public class ControleAtualizar {

	public void atualizar(Livros livros) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.atualizar(livros); 
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
