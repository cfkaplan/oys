package com.bilgeadam.oys;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainMenu {

    public static void main(String[] args) {
//	Student s1 = new Student();
//	s1.setBirthDate(new Date());
//	s1.setClassNumber(1);
//	Name name = new Name("Cebrail", "Kaplan");
//	s1.setEmployeeName(name);
//	List<PhoneNumber> phones = new ArrayList<>();
//	PhoneNumber phone = new PhoneNumber("mobile", "5445555555");
//	phones.add(phone);
//	s1.setPhones(phones);
	List<Employee> employeeList = new ArrayList<>();

	// 1 yeni calisan yaratma
	addEmployee(employeeList);

	// 2 calisan goruntule
	for (Employee emp : employeeList) {
	    System.out.println(emp);
	}

	// 3 eski calisan
	for (Employee emp : employeeList) {
	    if (emp.getEndDate() != null) {
		System.out.println(emp);
		System.out.println("giris : " + emp.getStartDate() + " end date : " + emp.getEndDate());
		Period period = Period.between(emp.getStartDate(), emp.getEndDate());

		System.out.print(period.getYears() + " years,");
		System.out.print(period.getMonths() + " months,");
		System.out.print(period.getDays() + " days");
		
	    }
	}

	// 4
	Teacher mainTeacher = new Teacher();
	mainTeacher.setEmployeeName(new Name("Teacher1Name", "Teacher1LastName"));
	Teacher secondTeacher = new Teacher();
	secondTeacher.setEmployeeName(new Name("Teacher2Name", "Teacher2LastName"));
	Course c1 = new Course(mainTeacher, secondTeacher, "Fluid Dynamics", 20);

	// 9
	for (Employee emp : employeeList) {

	}

    }

    private static void addEmployee(List<Employee> employeeList) {
	Name employeeName = new Name("Employee1Name", "Employee1Surname");
	LocalDate startDate = LocalDate.of(2020, 12, 1);
	LocalDate endDate = LocalDate.of(2022, 12, 1);
	List<PhoneNumber> phones = new ArrayList<>();
	PhoneNumber phone = new PhoneNumber("mobile", "5445555555");
	phones.add(phone);
	Employee e1 = new Employee("xxxxxx", employeeName, "M", "Unmarried", LocalDate.of(1995, 2, 22), startDate,
		endDate, 5000.0, phones);
	employeeList.add(e1);
    }

}
