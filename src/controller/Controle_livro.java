package controller;

import java.util.ArrayList;
import java.util.List;

import model.Livros;
import model.livrosDAO;
import view.Cadastrar;
import view.Home;

public class Controle_livro {

	private Home home;

	private Cadastrar ca;

	public Controle_livro(Home home) {
		this.home = home;
		System.out.println("testt");

		carregarLivros();
	}

	public void te() {
		System.out.println("ff");
	}
	
	
	public void salvarB() {
  System.out.println("salvar é salvar");
		try {
			livrosDAO doa = new livrosDAO();
			Livros li = getContatoTela();
			doa.salvar(li);

			

		} catch (Exception ex) {
			 System.out.println("salvar é salvar"+ ex);
			ex.printStackTrace();

		}
	}


	public Livros getContatoTela() {
		Livros livro = new Livros();
		livro.setNome(ca.getName().toString());
		livro.setAutor(ca.getAltor().toString());
		livro.setDescricao(ca.getDis().toString());
		return livro;
	}

	public void carregarLivros() {

		System.out.println("testt");
		try {
			List<Livros> livros = new ArrayList<>();
			livrosDAO doa = livrosDAO.getInstance();
			livros = doa.buscarContatos();

			for (Livros li : livros) {
				home.adicionarContatoTabela(li);
			}

		} catch (Exception e) {
			e.printStackTrace();
			home.exibirAlerta("ERRO:" + e.getMessage());
		}

	}

}
