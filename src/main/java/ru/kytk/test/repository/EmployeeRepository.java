package ru.kytk.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ru.kytk.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM employees" , nativeQuery = true)
    List<Employee> findAllEmployees();

    @Query(value = "SELECT * FROM employees where id = :id" , nativeQuery = true)
    List<Employee> findbyid(@Param("id") int id);

}
