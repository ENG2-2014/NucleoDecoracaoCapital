package model;

import java.util.List;

public class Nucleo {

	private List<Funcionario> funcionarios;
	private List<LojasAssociadas> lojasAssociadas;

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<LojasAssociadas> getLojasAssociadas() {
		return lojasAssociadas;
	}

	public void setLojasAssociadas(List<LojasAssociadas> lojasAssociadas) {
		this.lojasAssociadas = lojasAssociadas;
	}

}
