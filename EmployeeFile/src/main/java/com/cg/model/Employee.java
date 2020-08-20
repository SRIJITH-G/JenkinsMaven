package com.cg.model;

public class Employee {

	private int EmpId;
	private String EmpName;
	private Address address;
	public Employee(int empId, String empName, Address address) {
		super();
		EmpId = empId;
		EmpName = empName;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", address=" + address + "]";
	}
	
}
