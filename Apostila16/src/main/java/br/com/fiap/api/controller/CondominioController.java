package br.com.fiap.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CondominioController {

    @GetMapping("churros")
    public String dizerOla(){
        return "Ola Mundo!";
    }

}
