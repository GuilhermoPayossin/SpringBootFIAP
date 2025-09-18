package br.fiap.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TesteController {

    @GetMapping("/saudacao")
    public Map<String, String> saudacao(@RequestParam(defaultValue = "Fiap") String nome){
        return Map.of("Mensagem", "Olá " + nome);
    }
}
