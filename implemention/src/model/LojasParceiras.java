package model;

import java.util.List;

public class LojasParceiras {

	private int id;
	private String nome;
	private List<Compra> compras;
	private List<Premio> premios;
	
	public void entregarPremio(){}
	public void realizarCompra(){}

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

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Premio> getPremios() {
		return premios;
	}

	public void setPremios(List<Premio> premios) {
		this.premios = premios;
	}

}
