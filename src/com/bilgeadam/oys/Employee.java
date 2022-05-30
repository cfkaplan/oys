package com.bilgeadam.oys;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Employee {
    private String sicilNumber;
    private Name employeeName;
    private String gender;
    private String marriageStatus;
    private LocalDate birthDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double startSalary;
    private List<PhoneNumber> phones;

    public Employee() {
	super();
    }

    public Employee(String sicilNumber, Name employeeName, String gender, String marriageStatus, LocalDate birthDate,
	    LocalDate startDate, LocalDate endDate, Double startSalary, List<PhoneNumber> phones) {
	super();
	this.sicilNumber = sicilNumber;
	this.employeeName = employeeName;
	this.gender = gender;
	this.marriageStatus = marriageStatus;
	this.birthDate = birthDate;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startSalary = startSalary;
	this.phones = phones;
    }

    public String getSicilNumber() {
	return sicilNumber;
    }

    public void setSicilNumber(String sicilNumber) {
	this.sicilNumber = sicilNumber;
    }

    public Name getEmployeeName() {
	return employeeName;
    }

    public void setEmployeeName(Name employeeName) {
	this.employeeName = employeeName;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public String getMarriageStatus() {
	return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
	this.marriageStatus = marriageStatus;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    public LocalDate getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }

    public Double getStartSalary() {
	return startSalary;
    }

    public void setStartSalary(Double startSalary) {
	this.startSalary = startSalary;
    }

    public List<PhoneNumber> getPhones() {
	return phones;
    }

    public void setPhones(List<PhoneNumber> phones) {
	this.phones = phones;
    }

    @Override
    public String toString() {
	return "Employee [sicilNumber=" + sicilNumber + ", employeeName=" + employeeName + ", gender=" + gender
		+ ", marriageStatus=" + marriageStatus + ", birthDate=" + birthDate + ", startDate=" + startDate
		+ ", endDate=" + endDate + ", startSalary=" + startSalary + ", phones=" + phones + "]";
    }

}
