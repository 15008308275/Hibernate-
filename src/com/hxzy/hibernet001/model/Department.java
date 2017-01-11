package com.hxzy.hibernet001.model;

import java.util.Set;

public class Department {
	private int did;
	private String name;
	private int number;
	private String descripte;
	private Set<Employee> employees;

	public Department(String name, int number, String descripte,
			Set<Employee> employees) {
		super();
		this.name = name;
		this.number = number;
		this.descripte = descripte;
		this.employees = employees;
	}

	public Department() {
	}

	public Department(int did, String name, int number, String descripte,
			Set<Employee> employees) {
		this.did = did;
		this.name = name;
		this.number = number;
		this.descripte = descripte;
		this.employees = employees;
	}

	public Department(int did, String name, int number, String descripte) {
		this.did = did;
		this.name = name;
		this.number = number;
		this.descripte = descripte;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescripte() {
		return descripte;
	}

	public void setDescripte(String descripte) {
		this.descripte = descripte;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
