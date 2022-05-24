package com.infy.managerApp.repo;

import com.infy.managerApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    //Spring will create a query to delete this.
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
