package com.prueba.prueba.controllers;

import com.prueba.prueba.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");
        return usuario;
    }
}
