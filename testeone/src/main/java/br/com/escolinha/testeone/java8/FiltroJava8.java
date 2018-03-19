package br.com.escolinha.testeone.java8;

import java.util.ArrayList;
import java.util.List;

public class FiltroJava8 {

	public static void main(String[] args) {
		
		for (MarcaDeCarro marca : getCarrosComMenosDe50Anos()) {
			System.out.println(marca.getNome());
		}
		
	}
	
	public static List<MarcaDeCarro> getCarrosComMenosDe50Anos() {
		
		List<MarcaDeCarro> lista = null; //TODO: Implementar aqui a logica com o filtro do java8 para filtrar as marcas com menos de 50 anos;
								  //      Lembrar que para isso deve-se utilizar o recurso "stream" do java8						
		
		return lista;
	}
	
	public static List<MarcaDeCarro> getListaDeMarcas() {
		List<MarcaDeCarro> lista = new ArrayList<>();
		
		lista.add(new MarcaDeCarro("Honda", 45));
		lista.add(new MarcaDeCarro("Volkswagen", 35));
		lista.add(new MarcaDeCarro("Fiat", 10));
		lista.add(new MarcaDeCarro("Ford", 20));
		lista.add(new MarcaDeCarro("Toyota", 80));
		lista.add(new MarcaDeCarro("Subaru", 35));
		lista.add(new MarcaDeCarro("Ferrari", 100));
		lista.add(new MarcaDeCarro("Alpha Romeo", 55));
		lista.add(new MarcaDeCarro("BMW", 33));
		lista.add(new MarcaDeCarro("Jaguar", 90));
		lista.add(new MarcaDeCarro("Kia", 22));
		lista.add(new MarcaDeCarro("Nissan", 67));
		
		return lista;
	}
	
}


