package model;

public class Compra {

	private int id;
	private double valor;
	private LojasParceiras lojaParceira;
	private Cliente cliente;
	private LojasAssociadas lojaAssociada;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LojasParceiras getLojaParceira() {
		return lojaParceira;
	}

	public void setLojaParceira(LojasParceiras lojaParceira) {
		this.lojaParceira = lojaParceira;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LojasAssociadas getLojaAssociada() {
		return lojaAssociada;
	}

	public void setLojaAssociada(LojasAssociadas lojaAssociada) {
		this.lojaAssociada = lojaAssociada;
	}

}
