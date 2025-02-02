package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmpleadoRepository;
import com.luv2code.springboot.cruddemo.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private EmpleadoRepository employeeRepository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Empleado> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Empleado findById(int theId) {
        Optional<Empleado> result = employeeRepository.findById(theId);

        Empleado theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public Empleado save(Empleado theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}






