package com.webSecurity.securingweb.api;

import com.webSecurity.securingweb.model.Employee;
import com.webSecurity.securingweb.service.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employeedata")
    public void addEmployee(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("employee", employee);
        employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{userId}")
    public List<Employee> getEmployee(@PathVariable("userId") int userId){
        return employeeService.getEmployee(userId);
    }
}
