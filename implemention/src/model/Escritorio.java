package model;

import java.util.List;

public class Escritorio {

	private int id;
	private String nome;
	private List<Profissional> profissionais;
	
	public void relacionarProfissional(){}
	
	public void somarPontosProfissional(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

}
