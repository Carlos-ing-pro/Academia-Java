package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario findById(int theId);

    Usuario save(Usuario theUsuario);

    void deleteById(int theId);

}
