package model;

import java.util.List;

public class Pontuacao {

	private int total;
	private int ano;
	private Profissional profissional;
	private List<LojasAssociadas> lojasAssociadas;
	
	public void somatoria(){}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public List<LojasAssociadas> getLojasAssociadas() {
		return lojasAssociadas;
	}

	public void setLojasAssociadas(List<LojasAssociadas> lojasAssociadas) {
		this.lojasAssociadas = lojasAssociadas;
	}

}
