package com.malika.entities;

import org.hibernate.validator.constraints.Range;

public class emp {
	private int id;
	private String name;
	private String email;
	
	
	//validation
	@Range(min=10, max=10, message="PHONE NO. SHOULD CONTAIN ONLY 10 DIGITS")
	private long phone;
	
	private String company;
	
	public emp(int id, String name, String email, long phone, String company) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.company = company;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", company=" + company
				+ "]";
	}
	

}
