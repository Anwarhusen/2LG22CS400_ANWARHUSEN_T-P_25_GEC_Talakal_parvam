package com.example.studentcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentcrud.model.Employee;

@Repository
public interface AnwarEmployeeRepository extends JpaRepository<Employee, Long>  {
}