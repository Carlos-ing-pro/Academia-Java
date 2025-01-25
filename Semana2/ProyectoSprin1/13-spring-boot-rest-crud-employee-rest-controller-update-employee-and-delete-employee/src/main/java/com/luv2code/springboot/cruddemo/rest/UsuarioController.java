package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Usuario;
import com.luv2code.springboot.cruddemo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService UsuarioService) {
    	usuarioService = UsuarioService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/employees/{employeeId}")
    public Usuario getEmployee(@PathVariable int employeeId) {

    	Usuario theEmployee = usuarioService.findById(employeeId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/employees")
    public Usuario addEmployee(@RequestBody Usuario theEmployee) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theEmployee.setId(0);

        Usuario dbEmployee = usuarioService.save(theEmployee);

        return dbEmployee;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/employees")
    public Usuario updateEmployee(@RequestBody Usuario theEmployee) {

    	Usuario dbEmployee = usuarioService.save(theEmployee);

        return dbEmployee;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int usuarioId) {

    	Usuario tempEmployee = usuarioService.findById(usuarioId);

        // throw exception if null

        if (tempEmployee == null) {
            throw new RuntimeException("Employee id not found - " + usuarioId);
        }

        usuarioService.deleteById(usuarioId);

        return "Deleted employee id - " + usuarioId;
    }

}














