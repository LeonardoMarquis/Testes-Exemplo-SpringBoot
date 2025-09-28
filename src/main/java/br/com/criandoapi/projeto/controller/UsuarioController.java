package br.com.criandoapi.projeto.controller;

import java.util.List;

import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 // indica que essa classe é uma classe de controle, e nesse caso, um endpoint
public class UsuarioController {

    @Autowired
    private IUsuario dao;


    @GetMapping("/usuarios")        // um endpoint no endereço /usuarios e agora quando acessa por: localhost:8080/usuarios, vai mostrar essa mensagem definida abaixo
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
    }
}
