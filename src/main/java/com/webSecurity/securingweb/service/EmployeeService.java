package com.webSecurity.securingweb.service;

import com.webSecurity.securingweb.dao.EmployeeDao;
import com.webSecurity.securingweb.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public int addEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }


    public List<Employee> getAllEmployee() {
        return employeeDao.selectAllEmployee();
    }


    public List<Employee> getEmployee(int userId){
        return employeeDao.selectEmployee(userId);
    }

}
