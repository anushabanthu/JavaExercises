package com.cjss.training.model;
import java.time.LocalDate;

public class StudentFee {
	private int StudentRollNo;
	private int FeeAmount;
	private LocalDate Date;
	
	public StudentFee(int StudentRollNo,int FeeAmount,LocalDate Date){
		this.StudentRollNo = StudentRollNo;
		this.FeeAmount = FeeAmount;
		this.Date = Date;
	}
	
	public int getStudentRollNo() {
		return StudentRollNo;
	}
	public int getFeeAmount() {
		return FeeAmount;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setStudentRollNo(int StudentRollNo) {
		this.StudentRollNo = StudentRollNo;
	}
	public void setFeeAmount(int FeeAmount) {
		this.FeeAmount = FeeAmount;
	}
	public void setDate(LocalDate Date) {
		this.Date = Date;
	}
}
