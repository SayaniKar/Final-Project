package com.Sayani.DeptExample;

public class StudentID {
     int studentId;
	static int autoGeneratorID;
	int benchNo;
	static int autoGeneratorBenchNo;
	
	public StudentID() {
		super();
		studentId = ++autoGeneratorID;
		benchNo = ++autoGeneratorBenchNo;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public int getBenchNo() {
		return benchNo;
	}

	@Override
	public String toString() {
		return "StudentID [" + studentId + ", " + benchNo + "]";
	}
	

}
