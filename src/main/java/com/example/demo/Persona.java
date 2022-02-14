package com.example.demo;



public class Persona {
    private String nombre;
    private String población;
    private Integer edad;

    public  Persona(String nombre,String población,Integer edad){
        this.setNombre(nombre);
        this.setPoblación(población);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblación() {
        return población;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String newName) {
        this.nombre = newName;
    }

    public void setPoblación(String newPoblacion) {
        this.población = newPoblacion;
    }

    public void setEdad(Integer newEdad) {
        this.edad = newEdad;
    }
}


