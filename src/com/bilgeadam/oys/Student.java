package com.bilgeadam.oys;

public class Student extends Employee {

    private String registerNumber;
    private int classNumber;

    public String getRegisterNumber() {
	return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
	this.registerNumber = registerNumber;
    }

    public int getClassNumber() {
	return classNumber;
    }

    public void setClassNumber(int classNumber) {
	this.classNumber = classNumber;
    }

    @Override
    public String toString() {
	return "Student [registerNumber=" + registerNumber + ", classNumber=" + classNumber + ", toString()="
		+ super.toString() + "]";
    }

}
