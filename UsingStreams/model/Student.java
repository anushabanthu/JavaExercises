package com.cjss.training.model;

public class Student {
	private int StudentRollNo;
	private String StudentName;
	private String StudentBranch;
	private int StudentYear;
	
	public Student(int StudentRollNo,String StudentName, String StudentBranch, int StudentYear){
		this.StudentRollNo = StudentRollNo;
		this.StudentName = StudentName;
		this.StudentBranch = StudentBranch;
		this.StudentYear = StudentYear;
	}
	
	public int getStudentRollNo(){
		return StudentRollNo;
	}
	public String getStudentName(){
		return StudentName;
	}
	public String getStudentBranch(){
		return StudentBranch;
	}
	public int getStudentYear(){
		return StudentYear;
	}
	public void setStudentRollNo(int StudentRollNo){
		this.StudentRollNo = StudentRollNo;
	}
	public void setStudentName(String StudentName){
		this.StudentName = StudentName;
	}
	public void setStudentBranch(String StudentBranch){
		this.StudentBranch = StudentBranch;
	}
	public void setStudentYear(int StudentYear){
		this.StudentYear = StudentYear;
	}

	@Override
	public String toString() {
		return "Student [StudentRollNo=" + StudentRollNo + ", StudentName=" + StudentName + ", StudentBranch="
				+ StudentBranch + ", StudentYear=" + StudentYear + "]";
	}
	
}
