package com.Sayani.Java8.StudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Sayani.Java8.Java8practice.StudentData;

public class StudentService {
	/**
	 * Creating studentRecords using Lambda Expression
	 */
	static /*int position;
	StudentData studentDataArray[];
	public void addStudent(StudentData studentData)
	{
		 studentDataArray[position]=studentData;
		position++;
		
	}
	public StudentData[] displayStudent()
	{
		return studentDataArray;
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		StudentService studentService=new StudentService();
		studentService.addStudent(new StudentData("Sayani",14,2014,2018,911234567));
		System.out.println(studentService.displayStudent());;
	
}*/
	List<StudentData> list1=new ArrayList<StudentData>();
	int position;
	public void addStudent(StudentData studentdata)
	{
	 list1.add(studentdata);
	}
	
	public ArrayList<StudentData> getAllDetails()
	{
		return (ArrayList<StudentData>) list1;
	}
	public static void main(String args[])
	{
		StudentService studentService=new StudentService();
		studentService.addStudent(new StudentData("Sayani",14,2014,2018,9123456,"ECE"));
		list1.forEach(n->System.out.println(n));
		list1.forEach(System.out::println);
	}
	}


