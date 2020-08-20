package com.cg.test;

import org.junit.Test;

import com.cg.exception.MinimumAttendaceException;
import com.cg.files.EmployeeFileImpl;
import com.cg.files.EmployeeFiles;
import com.cg.model.Address;
import com.cg.model.Employee;

public class TestEmployee {

	public EmployeeFiles files;
	
	{
		files = new EmployeeFileImpl();
	}
	
	@Test (expected= MinimumAttendaceException.class)
	public void checkEmpAttendance() throws MinimumAttendaceException
	{
		Employee employee = new Employee();
		employee.setEmpId(1010);
		employee.setEmpName("Srijth");
		employee.setAddress(new Address("Chennai,TamilNadu", null));
		
		files.openAttendance(employee ,90);
		
	}
}

