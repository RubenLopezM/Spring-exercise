package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ciudad {
    private String nombre;
    private int habitantes;

}
