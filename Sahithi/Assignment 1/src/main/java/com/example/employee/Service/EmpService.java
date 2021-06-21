package com.example.employee.Service;

import com.example.employee.Model.Employee;
import com.example.employee.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;
    public List<Employee> getAllEmp() {
        return empRepository.getAllEmp();
    }
    public String addEmp(Employee emp)
    {
        if (empRepository.addEmp(emp.getId(),emp.getName(),emp.getEmail(),emp.getMobile(),emp.getCompany())== 1) {
            return "Emp added successfully!";
        }
        else {
            return "oops.....Something is wrong!";
    }
    }

    public List<Employee> getEmpDetails(Employee emp) {
        return empRepository.getEmpDetails(emp.getId());
    }


    public String updateEmp(@RequestBody Employee emp)
    {
        if(empRepository.updateEmp(emp.getId(),emp.getName()) == 1)
            return "EMP UPDATED SUCESSFULLY";
        else
            return "oops.....Something is wrong!";
    }


    public String deleteEmp(Employee emp) {

        if(empRepository.deleteEmp(emp.getId())==1)
            return "EMp DELETED SUCESSFULLY";
        else
            return "oops.....Something is wrong!";
    }
}
