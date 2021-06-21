package com.example.employee.controller;

import com.example.employee.Model.Employee;
import com.example.employee.Service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/emps")
    @ResponseBody
    public List<Employee> getAllEmp(){
        return empService.getAllEmp();

    }

    @PostMapping("/emps")
    @ResponseBody
    public String addEmp(@RequestBody Employee emp) {
        return empService.addEmp(emp);
    }


    @GetMapping("/emps/{id}")
    @ResponseBody
    public List<Employee> getEmpDetails(Employee emp)
    {
        return empService.getEmpDetails(emp);
    }

    @PutMapping("/emps")
    @ResponseBody
    public String updateEmp(@RequestBody Employee emp)
    {
        return empService.updateEmp(emp);
    }

    @DeleteMapping("/emps")
    @ResponseBody
    public String deleteEmp(@RequestBody Employee emp)
    {
        return empService.deleteEmp(emp);
    }


}