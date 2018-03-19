package br.com.escolinha.testeone.polimorfismo;

public class ContaPolimorfismo {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente(1000.00);
		Conta contaPoupanca = new ContaPoupanca(1000.00);
		
		//TODO: Implementar o polimorfismo para quando ocorrer o saque de conta corrente descontar o valor de 
		//      10.00 mas quando ocorrer o saque de conta poupanca nao ser descontado nenhum valor.
		
		contaCorrente.sacar(200.00);
		System.out.println("Valor Conta Corrente Depois do Saque: "+contaCorrente.getValor());
		
		contaPoupanca.sacar(200.00);
		System.out.println("Valor Conta Poupança Depois do Saque: "+contaCorrente.getValor());
		
	}

}
