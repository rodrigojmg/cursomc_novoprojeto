package com.rodrigojose.cursomc_novoprojeto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigojose.cursomc_novoprojeto.domain.Categoria;

// @RestController é um controlador especial usado para serviços RESTFul
@RestController
@RequestMapping(value="/categorias") // Rota da minha API(localhost:8080/categorias)
public class CategoriaResources {

	@RequestMapping(method=RequestMethod.GET)//Nesta parte estou definindo a minha request, exemplo(https://blog.mbeck.com.br/api-rest-e-os-verbos-http-46e189085e21)
	public List<Categoria>lista() {
		
		Categoria cat1 = new Categoria (1, "informatica");
		Categoria cat2 = new Categoria (2, "escritorio");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;
		
				}
}
