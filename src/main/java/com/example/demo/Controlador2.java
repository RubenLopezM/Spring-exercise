package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Map;
@RestController()
public class Controlador2 {

    @Autowired
    @Qualifier("bean")
    PersonaService persona;

    @Autowired
    ArrayList<CiudadService> ciudades;

    @GetMapping("/controlador2/getPersona")
    public PersonaService getperson(){
        persona.setAños(persona.getedad()*2);
        return  persona;
    }

    @GetMapping("/controlador2/getCiudad")
    public ArrayList getciudades(){

        return  ciudades;
    }

}
