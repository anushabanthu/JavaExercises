package com.cjss.training.model;

public class StudentMarks {
	private int StudentRollNumber;
	private Integer StudentYear;
	private int SubjectNumber;
	private int Marks;
	
	public StudentMarks(int StudentRollNumber,Integer StudentYear, int SubjectNumber, int StudentMarks){
		this.StudentRollNumber = StudentRollNumber;
		this.StudentYear = StudentYear;
		this.SubjectNumber = SubjectNumber;
		this.Marks = StudentMarks;
	}
	public int getStudentRollNumber() {
		return StudentRollNumber;
	}
	public Integer getStudentYear() {
		return StudentYear;
	}
	public int getSubjectNumber() {
		return SubjectNumber;
	}
	public int getMarks() {
		return Marks;
	}
	public void setStudentRollNumber(int StudentRollNumber) {
		this.StudentRollNumber = StudentRollNumber;
	}
	public void setStudentYear(Integer StudentYear) {
		this.StudentYear = StudentYear;
	}
	public void setSubjectNumber(int SubjectNumber) {
		this.SubjectNumber = SubjectNumber;
	}
	public void setMarks(int StudentMarks) {
		this.Marks = StudentMarks;
	}
}
