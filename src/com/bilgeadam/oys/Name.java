package com.bilgeadam.oys;

public class Name {
    private String name;
    private String secondName;
    private String lastName;

    public Name(String name, String secondName, String lastName) {
	super();
	this.name = name;
	this.secondName = secondName;
	this.lastName = lastName;
    }

    public Name(String name, String lastName) {
	super();
	this.name = name;
	this.lastName = lastName;
	this.secondName = null;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSecondName() {
	return secondName;
    }

    public void setSecondName(String secondName) {
	this.secondName = secondName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    @Override
    public String toString() {
	return "Name [name=" + name + ", secondName=" + secondName + ", lastName=" + lastName + "]";
    }

}
