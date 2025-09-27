package br.com.criandoapi.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 // indica que essa classe é uma classe de controle, e nesse caso, um endpoint
public class UsuarioController {
    @GetMapping("/usuarios")        // um endpoint no endereço /usuarios e agora quando acessa por: localhost:8080/usuarios, vai mostrar essa mensagem definida abaixo
    public String texto(){
        return "Usuario Controller";
    }
}
