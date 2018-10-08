package com.Sayani.DeptExample;

public class StudentDetails {
	String name;
	//StudentID studentID;
	int rollNo;
	String deptName;
	String year;
	long phoneNo;
	public StudentDetails(String name,  int rollNo, String deptName, String year, long phoneNo) {
		super();
		this.name = name;
		//this.studentID = studentID;
		this.rollNo = rollNo;
		this.deptName = deptName;
		this.year = year;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ",  rollNo=" + rollNo + ", deptName="
				+ deptName + ", year=" + year + ", phoneNo=" + phoneNo + "]";
	}
	

}
