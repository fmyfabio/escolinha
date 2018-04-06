package br.com.escolinha.testeone.dao;

import java.util.List;

import br.com.escolinha.testeone.entity.CarroEntity;

public interface CarroDao {

	public void salvar(CarroEntity carro);
	
	public List<CarroEntity> listar();
	
}
