package ru.kytk.test.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kytk.test.entity.Employee;
import ru.kytk.test.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class PostController {

    private final EmployeeRepository employeeRepository;

    public PostController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
        public Employee CreateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @DeleteMapping("delete/{id}")
    public String deletebyID(@PathVariable long id) {
        employeeRepository.deleteById(id);
        return null;
    }
}
