package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public interface PersonaService {

    public Persona createperson (String nombre,String ciudad,Integer edad);
    String getnombre();
    String getpueblo();
    Integer getedad();
    void setAños(Integer edad);
}
