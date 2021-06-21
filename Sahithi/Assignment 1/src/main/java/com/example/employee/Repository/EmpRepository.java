package com.example.employee.Repository;

import com.example.employee.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmp() {

        String query = "SELECT * FROM Emp ";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Employee.class));

    }
    public int addEmp(int id, String name,String email,int mobile,String company) {

        String query = "INSERT INTO Emp VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(query, id, name,email,mobile,company);
    }

    public List<Employee> getEmpDetails(int id) {
        String query = "SELECT * FROM Emp WHERE ID=?";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper<>(Employee.class),id);
    }

    public int updateEmp(int id, String name)
    {
        String query="UPDATE Emp SET NAME=? WHERE ID=?";
        return jdbcTemplate.update(query,name,id);
    }

    public int deleteEmp(int id)
    {
        String query="DELETE Emp WHERE ID=?";
        return jdbcTemplate.update(query,id);
    }
}
