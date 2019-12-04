package com.jaru.springbootapi.repository;

import com.jaru.springbootapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
