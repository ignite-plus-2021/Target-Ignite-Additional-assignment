package com.example.employee.Model;

import org.hibernate.validator.constraints.Range;

public class Employee {
    private int id;
    private String name;
    private String email;

    @Range (min=10, max=10, message="PHONE NO. SHOULD CONTAIN ONLY 10 DIGITS")
    private long mobile;

    private String company;

    public Employee() {
    }
    public Employee(int id, String name, String email,int mobile, String company) {
        this.id = id;
        this.name = name;
        this.email=email;
        this.mobile=mobile;
        this.company=company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}