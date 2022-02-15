package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bean")
public class PersonaServiceImpl implements PersonaService {

    Persona persona=new Persona();



    public Persona createperson(String nombre,String población,Integer edad){
     persona.setNombre(nombre);
     persona.setPoblación(población);
     persona.setEdad(edad);
     return persona;
    }


    public String getnombre(){
        return persona.getNombre();
    }

    public String getpueblo(){
        return persona.getPoblación();
    }

    public Integer getedad(){
            return persona.getEdad();
    }

    public void setAños(Integer edad){
        persona.setEdad(edad);
    }
}
