package com.prueba.prueba.controllers;

import com.prueba.prueba.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Melissa");
        usuario2.setApellido("Asencio Espinosa");
        usuario2.setEmail("melissa.asencio@gmail.com");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        return usuarios;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellido("Asencio");
        usuario.setEmail("jorge.asencio92@gmail.com");
        return usuario;
    }
}
