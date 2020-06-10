package controller;

import model.Livros;
import model.livrosDAO;

public class ControleCadastrar {

	Controle_livro ca;
    
	public void salvarB(Livros livros) {
		 
				try {
					
					livrosDAO doa= livrosDAO.getInstance();
					
					
					
					doa.salvar(livros);
				 
                    
                   					

				} catch (Exception ex) {
					 System.out.println("salvar é salvar"+ ex);
					ex.printStackTrace();

				}
			}
	
	 
	
}
