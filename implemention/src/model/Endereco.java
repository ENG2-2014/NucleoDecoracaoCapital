package model;

import java.util.List;

public class Endereco {

	private String rua;
	private int numero;
	private String complemento;
	private String cep;
	private Bairro bairro;
	private List<Pessoa> profissionais;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public List<Pessoa> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Pessoa> profissionais) {
		this.profissionais = profissionais;
	}

}
