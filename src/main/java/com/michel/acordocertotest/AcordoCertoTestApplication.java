package com.michel.acordocertotest;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michel.acordocertotest.domain.Categoria;
import com.michel.acordocertotest.repositories.CategoriaRepository;

@SpringBootApplication
public class AcordoCertoTestApplication  implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AcordoCertoTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Categoria cat1 = new Categoria(0, "informatica");
		Categoria cat2 = new Categoria(0, "escritorio");
		
		categoriaRepository.save(Arrays.asList(cat1, cat2));
		
	}

}
