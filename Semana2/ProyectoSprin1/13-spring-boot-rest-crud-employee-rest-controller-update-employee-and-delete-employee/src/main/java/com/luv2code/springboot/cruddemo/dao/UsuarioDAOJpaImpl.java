package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioDAOJpaImpl implements UsuarioDAO {

    // define field for 
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public UsuarioDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Usuario> findAll() {

        // create a query
        TypedQuery<Usuario> theQuery = entityManager.createQuery("from Employee", Usuario.class);

        // execute query and get result list
        List<Usuario> employees = theQuery.getResultList();

        // return the results
        return employees;
    }

    @Override
    public Usuario findById(int theId) {

        // get employee
    	Usuario theEmployee = entityManager.find(Usuario.class, theId);

        // return employee
        return theEmployee;
    }

    @Override
    public Usuario save(Usuario theUsuario) {

        // save employee
    	Usuario dbEmployee = entityManager.merge(theUsuario);

        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
    	Usuario theEmployee = entityManager.find(Usuario.class, theId);

        // remove employee
        entityManager.remove(theEmployee);
    }
}











