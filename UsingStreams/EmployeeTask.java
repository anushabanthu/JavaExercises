package com.cjss.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cjss.training.model.Department;
import com.cjss.training.model.Location;
import com.cjss.training.model.Benefit;
import com.cjss.training.model.Employee;

public class EmployeeTask {
	public static void main(String[] args) {
		
		List<Department> departments = new ArrayList<>();
		departments.add(new Department(3,"Admin","London"));
		departments.add(new Department(1,"HealthCare","Hyderabad"));
		departments.add(new Department(4,"Fraud","Hyderabad"));
		departments.add(new Department(2,"Finance","Chennai"));
		
		List<Location> locations = new ArrayList<>();
		locations.add(new Location(1,"Hyderabad","India"));
		locations.add(new Location(2,"Bangalore","India"));
		locations.add(new Location(3,"Chennai","ABC"));
		locations.add(new Location(4,"London","UK"));
		locations.add(new Location(5,"Chennai","India"));
		
		List<Benefit> benefits = new ArrayList<>();
		benefits.add(new Benefit(1,"Commute","Pickup and drop available"));
		benefits.add(new Benefit(2,"Bonus","Given based on performance"));
		benefits.add(new Benefit(3,"PhoneBill","Paid by company"));
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(4,"name1",10000,5,2,Arrays.asList(benefits.get(1).getBenefitId(),benefits.get(2).getBenefitId())));
		employees.add(new Employee(6,"name2",10000,4,1,Arrays.asList(benefits.get(0).getBenefitId(),benefits.get(1).getBenefitId())));
		employees.add(new Employee(2,"name5",10000,2,1,Arrays.asList(benefits.get(1).getBenefitId())));
		employees.add(new Employee(1,"name6",10000,1,3,Arrays.asList()));
		employees.add(new Employee(3,"name4",10000,1,2,Arrays.asList(benefits.get(1).getBenefitId(),benefits.get(2).getBenefitId())));
		employees.add(new Employee(5,"name3",10000,3,4,Arrays.asList(benefits.get(0).getBenefitId(),benefits.get(1).getBenefitId(),benefits.get(2).getBenefitId())));
		employees.add(new Employee(7,"name7",10000,5,1,Arrays.asList(benefits.get(1).getBenefitId())));
		
//		Task1 -> EmployeeTask Retrieve all employees in India
		System.out.println("1)EMPLOYEES OF INDIA");
		System.out.println("EMPLOYEE_ID  EMPLOYEE_NAME	LOCATION");
		employees.forEach(employee->{
//			locations.stream().filter(location->location.getLocationId()==employee.getLocationId()).
//			filter(locationRequired->locationRequired.getLocationCountry()=="India").forEach(indiaLocation->System.out.println(employee.getemployeeId()+"		"+employee.getEmployeeName() + "		" + indiaLocation.getLocationCountry()));
			locations.stream().filter(location->location.getLocationId()==employee.getLocationId()).
			filter(locationRequired->locationRequired.getLocationCountry()=="India").forEach(indiaLocation->System.out.println(employee.getemployeeId()+"		"+employee.getEmployeeName() + "		" + indiaLocation.getLocationCountry()));

		});
		
//		Task2 -> Retrieve employees who are in Chennai or Hyderabad
		System.out.println("\n2)EMPLOYEES OF CHENNAI OR HYDERABAD");
		System.out.println("EMPLOYEE_ID  EMPLOYEE_NAME	LOCATION");
		employees.forEach(employee->{
			locations.stream().filter(location->location.getLocationId()==employee.getLocationId()).
			filter((locationRequired->locationRequired.getLocationName()=="Chennai" || locationRequired.getLocationName()=="Hyderabad")).
			forEach(required->System.out.println(employee.getemployeeId()+"		"+employee.getEmployeeName() + "		" + required.getLocationName()));
		});
		
//		Task3 -> Retrieve employees who have Benefits and display benefits details
		System.out.println("\n3)EMPLOYEES WITH BENEFITS");
		System.out.print("EMPLOYEE_ID  EMPLOYEE_NAME	BENEFITS");
		employees.stream().filter(employee->!employee.getBenefitId().isEmpty()).forEach(withBenefits->{
			System.out.println();
			System.out.print(withBenefits.getemployeeId()+"		"+withBenefits.getEmployeeName() + "		" );
			withBenefits.getBenefitId().forEach(benefitId->{
				benefits.stream().filter(benefit->benefitId==benefit.getBenefitId()).forEach(required->System.out.print(required.getBenefitName()+" "));
			});
		});
		
//		Task4 -> Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
		System.out.println("\n4)EMPLOYEES DETAILS");
		System.out.print("EMPLOYEE_ID  EMPLOYEE_NAME	SALARY	DEPT_NAME	LOCATION_NAME	LOCATION_COUNTRY");
		employees.forEach(employee->{
			System.out.println();
			System.out.print(employee.getemployeeId()+"		"+employee.getEmployeeName()+"		"+employee.getSalary()+"	");
			departments.stream().filter(dept->dept.getDeptId()==employee.getDeptId()).forEach(deptsRequired->System.out.print(deptsRequired.getDeptName()+"		"));
			locations.stream().filter(location->location.getLocationId()==employee.getLocationId()).forEach(required->System.out.print(required.getLocationName()+" 	  "+required.getLocationCountry()));
		});
		
//		Task5 -> Retrieve employees who are in Chennai and India
		System.out.println("\n5)EMPLOYEES IN CHENNAI AND INDIA");
		System.out.print("EMPLOYEE_ID  EMPLOYEE_NAME	LOCATION	COUNTRY");
		System.out.println();
		employees.forEach(employee->{
			locations.stream().filter(location->location.getLocationCountry()=="India").filter(indiaCountry->indiaCountry.getLocationName()=="Chennai").
			filter(chennaiLocation->chennaiLocation.getLocationId()==employee.getLocationId()).
			forEach(required->System.out.println(employee.getemployeeId()+"		"+employee.getEmployeeName() + "		"+required.getLocationName()+"		"+required.getLocationCountry()));
		});
	}
}

