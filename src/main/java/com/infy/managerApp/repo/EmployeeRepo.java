package com.infy.managerApp.repo;

import com.infy.managerApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    //Spring will create a query to delete this.
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
