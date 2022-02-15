package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController()
public class Ejercicio1 {

    @GetMapping("/user/{nombre}")
    public String sayHello(@PathVariable String nombre)  {
        return ("Hola " + nombre);
    }

    @PostMapping("/useradd")
    Persona add(@RequestBody Persona persona){
        persona.setEdad(persona.getEdad()+1);
        return persona;
    }




}
