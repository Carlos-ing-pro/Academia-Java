package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.UsuarioDAO;
import com.luv2code.springboot.cruddemo.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDAO usuarioDAO;

    @Autowired
    public UsuarioServiceImpl(UsuarioDAO theEmployeeDAO) {
    	usuarioDAO = theEmployeeDAO;
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario findById(int theId) {
        return usuarioDAO.findById(theId);
    }

    @Transactional
    @Override
    public Usuario save(Usuario theEmployee) {
        return usuarioDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
    	usuarioDAO.deleteById(theId);
    }
}






