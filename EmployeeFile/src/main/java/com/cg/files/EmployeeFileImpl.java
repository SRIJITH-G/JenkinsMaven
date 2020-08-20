package com.cg.files;

import com.cg.exception.MinimumAttendaceException;
import com.cg.model.Attendance;
import com.cg.model.Employee;

public class EmployeeFileImpl implements EmployeeFiles {

	public Attendance openAttendance(Employee employee, int i) throws MinimumAttendaceException {
		
		if(employee==null)
		{
			System.out.println("not found");
			throw new IllegalArgumentException("Employee not found");
		
		}
		if(i<100)
		{
			throw new MinimumAttendaceException("Minimum attendance percentage ");
		}
		
		Attendance atd = new Attendance();
		atd.setAttendanceId(101);
		atd.setDayspresent(i);
		atd.setEmployee(employee);
		return atd;
		
	}
	
	

}
