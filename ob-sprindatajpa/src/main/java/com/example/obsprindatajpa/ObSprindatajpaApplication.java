package com.example.obsprindatajpa;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ObSprindatajpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(ObSprindatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);
		
		System.out.println("Unidades en la base de datos " + repository.count());
		
		Coche toyota = new Coche(null,"Toyota","Prius",LocalDate.of(2010, 8, 12));
		repository.save(toyota);    // Guardar coche en base de datos
		
		System.out.println("Unidades en la base de datos " + repository.count());
		
		System.out.println(repository.findAll());    // Nos muestra todos los coches que estan en base de datos
	}

}
