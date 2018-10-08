package com.Sayani.Java8.Java8practice;

public class StudentData {
	int student_id;
	static int studentID;
	String studentName;
	int studentRollNo;
	int firstYear;
	int finalYear;
	long phoneNo;
	String deptName;
	
	public StudentData() {
		super();
	}

	public StudentData( String studentName, int studentRollNo, int firstYear, int finalYear,
			long phoneNo,String deptName) {
		super();
		student_id = ++studentID;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.firstYear = firstYear;
		this.finalYear = finalYear;
		this.phoneNo = phoneNo;
		this.deptName=deptName;
	}
public String getDeptName()
{
	return deptName;
}
public void setDeptName()
{
	this.deptName=deptName;
}
public int getStudentID()
{
	return studentID;
}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public int getFirstYear() {
		return firstYear;
	}

	public void setFirstYear(int firstYear) {
		this.firstYear = firstYear;
	}

	public int getFinalYear() {
		return finalYear;
	}

	public void setFinalYear(int finalYear) {
		this.finalYear = finalYear;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "StudentData [" + student_id + ", " + studentName + ", "
				+ studentRollNo + ", " + firstYear + ",  "+ finalYear + ", " + phoneNo + " , "+ deptName+"]";
	}
	
	

}
