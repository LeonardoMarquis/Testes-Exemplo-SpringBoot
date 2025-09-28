package br.com.criandoapi.projeto.controller;

import java.util.List;
import java.util.Optional;

import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController                 // indica que essa classe é uma classe de controle, e nesse caso, um endpoint
@RequestMapping("/usuarios")    // definindo aqui, os GetMapping terao essa rota como padrao, mas se quiser que seja diferente é so especificar no tal getmap
public class UsuarioController {

    @Autowired
    private IUsuario dao;


    @GetMapping        // um endpoint no endereço /usuarios e agora quando acessa por: localhost:8080/usuarios, vai mostrar essa mensagem definida abaixo
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
    }


    @PostMapping            //esse endpoint sera para criar novo usuario para o BD
    public Usuario criarUsuario(@RequestBody Usuario usuario){  //objeto do tipo Usuario sera salvo no banco
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }


    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioEditado = dao.save(usuario);
        return usuarioEditado;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario(@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;

    }


}
