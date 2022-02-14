package com.example.demo;


import lombok.Data;

@Data
public class Persona {
    private String nombre;
    private String población;
    private Integer edad;

    public  Persona(String nombre,String población,Integer edad){
        this.setNombre(nombre);
        this.setPoblación(población);
        this.setEdad(edad);
    }

}


