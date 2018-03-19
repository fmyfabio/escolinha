package br.com.escolinha.testeone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.escolinha.testeone.dao.CarroDao;
import br.com.escolinha.testeone.entity.CarroEntity;

@RestController
@RequestMapping("/carros")
public class CarroController {

	@Autowired
	private CarroDao carrosDao;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<CarroEntity>> get() {
		
		List<CarroEntity> lista = null; 
		
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ResponseEntity<Void> post(@RequestBody CarroEntity carro) {
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
