package com.spring.employee.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.spring.employee.dto.EmployeeDTO;

@Entity
@Table(name = "employee_payroll")

public class Employee 
{
	@Id
	@GeneratedValue()
	private int id;
	private String empDept;
	private String empName;
	private String empGender;
	private double empSalary;
	private String startDate;
//	private List<String> department;
	private String note;
	private String profilePic;
	
	public Employee(EmployeeDTO dto) 
	{
		this.empDept = dto.getEmpDept();
		this.empName = dto.getEmpName();
		this.empGender = dto.getEmpGender();
		this.empSalary = dto.getEmpSalary();
		this.startDate = dto.getStartDate();
//		this.department = dto.getDepartment();
		this.note = dto.getNote();
	}
	
	public Employee()
	{
		
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		
}
