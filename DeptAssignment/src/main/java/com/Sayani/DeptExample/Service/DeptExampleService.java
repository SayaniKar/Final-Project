package com.Sayani.DeptExample.Service;

import com.Sayani.DeptExample.StudentDetails;
import com.Sayani.DeptExample.StudentID;

import java.util.*;

public class DeptExampleService {
	int benchNo=0;
	int studentNo[];
	Map<StudentID,StudentDetails> student=new HashMap<StudentID,StudentDetails>();
	public void add(StudentID studentID,StudentDetails studentDetails)
	{
			do{studentNo[benchNo]=2;
			benchNo++;}while(benchNo!=4);
			if(benchNo>4)
				throw new RuntimeException("4 benches are allowed only");
		student.put(studentID,studentDetails);
			}
	
		
		
	
	public Map<StudentID, StudentDetails> getAllDetails()
	{
		return student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptExampleService deptExampleService=new DeptExampleService();
		deptExampleService.add(new StudentID(),new StudentDetails("aa",14,"ECE","first",9123456));
        System.out.println(deptExampleService.getAllDetails());
	}

}
