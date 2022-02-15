package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    Ciudad ciudad= new Ciudad();


    public void setCiudad(String nombre) {
        ciudad.setNombre(nombre);
    }


    public void setPoblacion(int habitantes) {
        ciudad.setHabitantes(habitantes);
    }


    public String getCiudad() {
        return ciudad.getNombre();
    }

    public int getPoblacion(){
        return ciudad.getHabitantes();
    }
}
