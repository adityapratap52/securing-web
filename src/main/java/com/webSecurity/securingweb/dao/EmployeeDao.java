package com.webSecurity.securingweb.dao;

import com.webSecurity.securingweb.model.Employee;

import java.util.List;

public interface EmployeeDao {
    int insertEmployee(Employee employee);

    List<Employee> selectAllEmployee();

    List<Employee> selectEmployee(int userId);
}

