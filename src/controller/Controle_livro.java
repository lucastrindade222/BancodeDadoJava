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
		home.ref(home);
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
