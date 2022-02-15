package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController()
public class Controlador1 {

    @Autowired
    @Qualifier("bean")
    PersonaService persona;

    @Autowired
    ArrayList<CiudadService> ciudades;

    @Autowired
    @Qualifier("bean1")
    PersonaService person1;


    @Autowired
    @Qualifier("bean2")
    PersonaService person2;


    @Autowired
    @Qualifier("bean3")
    PersonaService person3;

    @GetMapping("/controlador1/addPersona")
    public PersonaService addperson(@RequestHeader(value = "nombre") String nombre, @RequestHeader(value = "ciudad")String población, @RequestHeader(value = "edad")Integer edad){
        persona.createperson(nombre,población,edad);
        return  persona;
    }

    @PostMapping("/controlador1/addCiudad")
    public CiudadService addciudad(@RequestBody Ciudad ciudad){
        CiudadService ciudadService= new CiudadServiceImpl();
        ciudadService.setCiudad(ciudad.getNombre());
        ciudadService.setPoblacion(ciudad.getHabitantes());
        ciudades.add(ciudadService);
         return ciudadService;
    }

    @GetMapping("/controlador/bean/{bean}")
    public PersonaService getbeans(@PathVariable int bean){
        if (bean==1){
            return person1;
        } else if (bean==2){
            return person2;
        }else {
            return person3;
        }
    }

}



