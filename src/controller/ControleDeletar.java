package controller;

import model.livrosDAO;

public class ControleDeletar {
	
	
	public void Deletar(Integer id) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.deletar(id);
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	
	
	

}
