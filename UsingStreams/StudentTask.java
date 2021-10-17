package com.cjss.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.cjss.training.model.Student;
import com.cjss.training.model.StudentFee;
import com.cjss.training.model.Subject;
import com.cjss.training.model.StudentMarks;

public class StudentTask {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
	    students.add(new Student(202,"name4","cse",2));
	    students.add(new Student(301,"name5","cse",3));
	    students.add(new Student(302,"name6","ece",3));
	    students.add(new Student(101,"name1","ece",1));
	    students.add(new Student(102,"name2","cse",1));
	    students.add(new Student(201,"name3","ece",2));
	    
	    List <StudentFee> studentsFee = new ArrayList<>();
	    studentsFee.add(new StudentFee(101,10000,LocalDate.of(2021, 10, 10)));
	    studentsFee.add(new StudentFee(102,10000,LocalDate.of(2021, 9, 1)));
	    studentsFee.add(new StudentFee(201,20000,LocalDate.of(2021, 10, 1)));
	    studentsFee.add(new StudentFee(202,21000,LocalDate.of(2021, 8, 5)));
	    studentsFee.add(new StudentFee(301,30000,LocalDate.of(2021, 9, 2)));
	    studentsFee.add(new StudentFee(302,31000,LocalDate.of(2021, 10, 1)));
	    
	    List <Subject> subjects = new ArrayList<>();
	    subjects.add(new Subject(1,"S1"));
	    subjects.add(new Subject(2,"S2"));
	    
	    List <StudentMarks> studentsMarks = new ArrayList<>();
	    studentsMarks.add(new StudentMarks(101,1,1,99));
	    studentsMarks.add(new StudentMarks(102,1,1,80));
	    studentsMarks.add(new StudentMarks(101,1,2,77));
	    studentsMarks.add(new StudentMarks(102,1,2,100));
	    studentsMarks.add(new StudentMarks(201,2,1,90));
	    studentsMarks.add(new StudentMarks(202,2,1,67));
	    studentsMarks.add(new StudentMarks(201,2,2,43));
	    studentsMarks.add(new StudentMarks(202,2,2,10));
	    studentsMarks.add(new StudentMarks(301,3,1,9));
	    studentsMarks.add(new StudentMarks(302,3,1,30));
	    studentsMarks.add(new StudentMarks(301,3,2,37));
	    studentsMarks.add(new StudentMarks(302,3,2,90));
	    
//	    Task 1: Print student rno, name, branch of 1st year students
	    System.out.println("1)First Year Students Information:\nRNO NAME BRANCH");
	    students.stream().filter(student->student.getStudentYear()==1).forEach(firstYrStudents->System.out.println(firstYrStudents.getStudentRollNo()+" "+firstYrStudents.getStudentName()+" "+firstYrStudents.getStudentBranch()));
		
//	    Task 2: Print all students rno, name, branch, amount, date
	    System.out.println("\n2)All Students Information:\nRNO NAME BRANCH FEEAMOUNT DATE_PAID");
	    students.forEach(student->{
	    	System.out.print(student.getStudentRollNo()+" "+student.getStudentName()+" "+student.getStudentBranch());
	    	studentsFee.stream().filter(studentfee->studentfee.getStudentRollNo()==student.getStudentRollNo()).forEach(required->System.out.println("   "+required.getFeeAmount()+"     "+required.getDate()));
	    });
	    
//	    Task 3: Print all students rno, name, subjectName, marks
	    System.out.println("\n3)All Students Marks Information:\nRNO NAME SUBJECT MARKS");
	    students.forEach(student->{
	    	List <StudentMarks> marksRequired = studentsMarks.stream().filter(studentMarks->studentMarks.getStudentRollNumber() == student.getStudentRollNo()).collect(Collectors.toList());
	    	marksRequired.forEach(studentMarks->{
	    		subjects.stream().filter(subject->subject.getSubjectNumber()==studentMarks.getSubjectNumber()).
	    		forEach(required->System.out.println(student.getStudentRollNo()+" "+student.getStudentName()+"  "+required.getSubjectName()+"  	 "+studentMarks.getMarks()));
	    	});
	    });
	    
//	    Task 4: Print all students rno, name, subjectName, marks order by year
	    System.out.println("\n4)All Students Marks Information order by year:\nRNO 	NAME   SUBJECT 	MARKS 	YEAR");
	    List <Student> Marks = students.stream().sorted(Comparator.comparingInt(Student::getStudentYear)).collect(Collectors.toList());
	    Marks.forEach(marks->{
	    	List <StudentMarks> marksRequired = studentsMarks.stream().filter(studentMarks->studentMarks.getStudentRollNumber() == marks.getStudentRollNo()).collect(Collectors.toList());
	    	marksRequired.forEach(rNoMatched->{
	    		subjects.stream().filter(subject->subject.getSubjectNumber()==rNoMatched.getSubjectNumber()).
   	    		forEach(subNoMatched->System.out.println(marks.getStudentRollNo()+"	"+marks.getStudentName()+" 	"+subNoMatched.getSubjectName()+"	 "+rNoMatched.getMarks()+" 	"+rNoMatched.getStudentYear()));
	    	});
	    });
	}
}


