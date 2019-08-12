package com.spring.da;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int hashCode() {
		
		return id;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee)
			return ((Employee)obj).getId()==id;
		else {
		return true;
		}
	}



	
	public int compareTo(Employee emp) {
		if(emp.getId()>id)
		return -1;
		else if(emp.getId()>id)
			return 0;
		else
			return 1;
	}

}
