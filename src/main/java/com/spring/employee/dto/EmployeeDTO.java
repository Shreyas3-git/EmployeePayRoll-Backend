package com.spring.employee.dto;

import java.util.List;

public class EmployeeDTO 
{
	private String empDept;
	private int id;
	private String empName;
	private String empGender;
	private double empSalary;
	private String startDate;
//	private List<String> department;
	private String note;
	private String profilePic;
	
	public EmployeeDTO(String empDept, int id, String empName, String empGender, double empSalary, String startDate,
			List<String> department,String note,String profliePic) {
		super();
		this.empDept = empDept;
		this.id = id;
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;
		this.startDate = startDate;
//		this.department = department;
	}

	public EmployeeDTO()
	{
		
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

//	public List<String> getDepartment() {
//		return department;
//	}

//	public void setDepartment(List<String> department) {
//		this.department = department;
//	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	
}
