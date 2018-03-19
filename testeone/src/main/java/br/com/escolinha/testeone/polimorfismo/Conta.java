package br.com.escolinha.testeone.polimorfismo;

public class Conta {

	public Double valor;

	public Conta(Double valor) {
		super();
		this.valor = valor;
	}

	public void sacar(Double valorSaque) {
		this.valor = this.valor - valorSaque;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
