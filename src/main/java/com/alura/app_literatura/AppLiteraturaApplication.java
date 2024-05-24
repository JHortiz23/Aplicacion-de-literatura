package com.alura.app_literatura;

import com.alura.app_literatura.principal.Principal;
import com.alura.app_literatura.repository.AutorRepository;
import com.alura.app_literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppLiteraturaApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository repositoryLibro;

	@Autowired
	private AutorRepository repositoryAutor;

	public static void main(String[] args) {
		SpringApplication.run(AppLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositoryAutor, repositoryLibro);
		principal.iniciar();
	}
}
