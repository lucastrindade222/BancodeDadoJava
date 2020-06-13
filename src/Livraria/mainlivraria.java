package Livraria;

import controller.Controle_livro;
import view.Home;

public class mainlivraria {

	public static void main(String[] args) {

		try {

			 
			Home h = new Home();
			h.setVisible(true);

			new Controle_livro(h);

		} catch (Exception e) {
			System.out.println("ERRO menu:" + e);
			e.printStackTrace();
		}

	}

	
	 

	
}



