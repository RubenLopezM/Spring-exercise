package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Bs0Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs0Application.class, args);
	}


	@Bean
	ArrayList<CiudadService> createCiudad(){
		ArrayList<CiudadService> ciudades = new ArrayList<>();
        CiudadService ciudad= new CiudadServiceImpl();
		ciudad.setCiudad("Sant Feliu de LLobregat");
		ciudad.setPoblacion(45000);
		ciudades.add(ciudad);
		return ciudades;
	}

	@Bean(name = "bean1")
	public PersonaService createperson1(){
         PersonaServiceImpl person= new PersonaServiceImpl();
				 person.createperson("Rubén","Barcelona",30);
						 return person;
	}
	@Bean(name = "bean2")
	public PersonaService createperson2(){
		PersonaServiceImpl person2= new PersonaServiceImpl();
		person2.createperson("Cristian","Viladecans",44);
		return person2;
	}
	@Bean(name = "bean3")
	public PersonaService createperson3(){
		PersonaServiceImpl person3= new PersonaServiceImpl();
		person3.createperson("Ana","Sabadell",36);
		return person3;
	}
}
