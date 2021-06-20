package com.malika.Controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.malika.entities.emp;
import com.malika.service.empService;



@RestController
public class MyController {
	
	@Autowired
	private empService empService;
	
	@GetMapping("/emp")
	public List<emp> getemp() {
		return this.empService.getAllEmployee();
	}
	
	
	@GetMapping("/emp/{id}")
	public emp getEmployee(@Valid @PathVariable("id") int id) {
		return empService.getempbyid(id);
	}
	
	@PostMapping("/emp")
	public emp addemp(@Valid @RequestBody emp Employee) 
	{	
	
		emp e=this.empService.addEmployee(Employee);
		return e;	
	}
	
	@DeleteMapping("/emp/{id}")
	public void deleteEmp(@PathVariable("id") int id) {
		this.empService.deleteEmployee(id);
	}
	
	@PutMapping("/emp/{id}")
	public emp updateemp( @RequestBody emp employee, @PathVariable("id") int id) {
		this.empService.updateEmployee(employee, id);
		return employee;
		
	}
	

}