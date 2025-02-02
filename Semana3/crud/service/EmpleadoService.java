package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Empleado;

import java.util.List;

public interface EmpleadoService {

    List<Empleado> findAll();

    Empleado findById(int theId);

    Empleado save(Empleado theEmployee);

    void deleteById(int theId);

}
