package com.cg.files;

import com.cg.exception.MinimumAttendaceException;
import com.cg.model.Attendance;
import com.cg.model.Employee;

public interface EmployeeFiles {

	public Attendance openAttendance(Employee employee, int i)  throws MinimumAttendaceException;

	
}
