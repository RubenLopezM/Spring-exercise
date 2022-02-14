package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {

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
