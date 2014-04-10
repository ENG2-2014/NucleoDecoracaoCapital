package model;

import java.util.List;

public class Cliente extends Pessoa{

	private List<Profissional> profissionais;

	public void consultarProfissional(){}
	
	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

}
