package com.malika.service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.malika.entities.emp;


@Component
public class empService {
	
	private static List<emp> list= new ArrayList<>();
	
	// fake database
	static {
		list.add(new emp(1,"aaba",null, 1234567890, null));
	}
	
	public List<emp> getAllEmployee(){
		return list;
		
	}
	
	
	public emp getempbyid(int id) {
		
		emp employee=null;
		
		for(emp var:list) {
			if(var.getId()== id) {
				employee=var;
				break;
			}
		}
		return employee;
	}
	
	
	public emp addEmployee(emp e) {
		list.add(e);
		return e;
	}
	
	public void deleteEmployee(int eid) {
		list=list.stream().filter(emp -> emp.getId()!= eid).collect(Collectors.toList());				
		
	}
	
	public void updateEmployee(emp e, int id) {
		list = list.stream().map(emp->{
			if(emp.getId()==id){
				emp.setName(e.getName());
				emp.setEmail(e.getEmail());
				emp.setPhone(e.getPhone());
				emp.setCompany(e.getCompany());
			}
				return emp;
			}).collect(Collectors.toList());
	}
}

