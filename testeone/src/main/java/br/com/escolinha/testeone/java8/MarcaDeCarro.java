package br.com.escolinha.testeone.java8;

public class MarcaDeCarro {
	
	private String nome;
	private Integer idade;

	public MarcaDeCarro(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	} 

}
