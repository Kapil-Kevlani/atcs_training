package com.ia.springcore;

public class Employee {
	private int empid;
	private String name;
	private int empsal;
	private String empadd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.name = name;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", empsal=" + empsal + ", empadd=" + empadd + "]";
	}
	

}
