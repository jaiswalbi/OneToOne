package com.binay.oneToOne.entity.repo;

import com.binay.oneToOne.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
