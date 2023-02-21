package com.dependency.injection.xml.setter_based.example1;

public class Student {
	private String nameOfStudent;
	private int studentId;

	public void showDetails() {
		System.out.println(this.nameOfStudent + " is a Student having id " + this.studentId);
	}

	// setters and getter for studentId field
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	// to access and modify the name provide getters and setter for nameOfStudent
	// variable
	public String getNameOfStudent() {
		return nameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
}
