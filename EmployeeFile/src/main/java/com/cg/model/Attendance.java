package com.cg.model;

public class Attendance {

	private int attendanceId;
	private Employee employee;
	private int dayspresent;
	public Attendance(int attendanceId, Employee employee, int dayspresent) {
		super();
		this.attendanceId = attendanceId;
		this.employee = employee;
		this.dayspresent = dayspresent;
	}
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", employee=" + employee + ", dayspresent=" + dayspresent
				+ "]";
	}
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getDayspresent() {
		return dayspresent;
	}
	public void setDayspresent(int dayspresent) {
		this.dayspresent = dayspresent;
	}
	
	
	
}
