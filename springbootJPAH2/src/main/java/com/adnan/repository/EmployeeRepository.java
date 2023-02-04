package com.adnan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

import com.adnan.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
