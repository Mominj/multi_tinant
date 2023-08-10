package com.example.multi_tinant.apps.repo;

import com.example.multi_tinant.apps.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
}
