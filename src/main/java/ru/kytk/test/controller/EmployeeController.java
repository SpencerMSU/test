package ru.kytk.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kytk.test.entity.Employee;
import ru.kytk.test.repository.EmployeeRepository;

@RestController
@RequestMapping("/findallemployees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployees();
    }

    @GetMapping("current/{id}")
    public List<Employee> getEmployeeById(@PathVariable int id) {
    return employeeRepository.findbyid(id);

}
}
