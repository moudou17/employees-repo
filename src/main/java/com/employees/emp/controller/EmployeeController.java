package com.employees.emp.controller;

import com.employees.emp.model.Employee;
import com.employees.emp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all emplyees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
       return employeeRepository.findAll();
    }

    // Rest API to create employee
    @PostMapping("/employees")
    public  Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
