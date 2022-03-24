package com.kk.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sbjparestemp")
public class Employee {
	
	@Id
	@Column(name = "eid", length = 10)
	private int empid;
	@Column(name = "ename", length = 15)
	private String empName;
	@Column(name = "esal", length = 15)
	private int empSal;
	@Column(name = "eadd", length = 15)
	private String empAdd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, int empSal, String empAdd) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	
	

}
