package model;

public class Livros {

	
	
	private Integer ID;
	private String nome;
	private String altor;
	private String descricao;
	
	
	
	
	
	
	
	
	
	

	 
	 
	
	
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAltor() {
		return altor;
	}
	public void setAltor(String altor) {
		this.altor = altor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
	
	
	

	
	
	
	

	
	
	
	
	
	
	
	
}
