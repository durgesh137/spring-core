package com.dependency.injection.xml.constructor_based.example2;

public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void showDetails() {
		System.out.println("Constructor dependency injection used...");
		System.out.println(this.studentName+" is a Student having id "+this.studentId);
	}
	
}
