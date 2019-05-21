package com.michel.acordocertotest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michel.acordocertotest.domain.Categoria;
import com.michel.acordocertotest.repositories.CategoriaRepository;

@Service
public class CategoriaServices {
	@Autowired
    private CategoriaRepository repo;
    
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		return obj;
	}
	
	
}
