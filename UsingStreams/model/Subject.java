package com.cjss.training.model;

public class Subject {
	private int SubjectNumber;
	private String SubjectName;
	
	public Subject(int SubjectNumber, String SubjectName){
		this.SubjectNumber = SubjectNumber;
		this.SubjectName = SubjectName;
	}
	
	public int getSubjectNumber() {
		return this.SubjectNumber;
	}
	public String getSubjectName() {
		return this.SubjectName;
	}
	public void setSubjectNumber(int SubjectNumber) {
		this.SubjectNumber = SubjectNumber;
	}
	public void setSubjectName(String SubjectName) {
		this.SubjectName = SubjectName;
	}
}
