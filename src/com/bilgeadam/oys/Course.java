package com.bilgeadam.oys;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher mainTeacher;
    private Teacher secondTeacher;
    private String courseName;
    private Integer year;
    private List<Student> students;
    private int courseDuration;
    private CourseTime courseTime;

    public Course(Teacher mainTeacher, Teacher secondTeacher, String courseName, int studentNumber) {
	super();
	this.mainTeacher = mainTeacher;
	this.secondTeacher = secondTeacher;
	this.courseName = courseName;
	this.students = new ArrayList<>(studentNumber);
    }

    public Teacher getMainTeacher() {
	return mainTeacher;
    }

    public void setMainTeacher(Teacher mainTeacher) {
	this.mainTeacher = mainTeacher;
    }

    public Teacher getSecondTeacher() {
	return secondTeacher;
    }

    public void setSecondTeacher(Teacher secondTeacher) {
	this.secondTeacher = secondTeacher;
    }

    public String getCourseName() {
	return courseName;
    }

    public void setCourseName(String courseName) {
	this.courseName = courseName;
    }

    public Integer getYear() {
	return year;
    }

    public void setYear(Integer year) {
	this.year = year;
    }

    public List<Student> getStudents() {
	return students;
    }

    public void setStudents(List<Student> students) {
	this.students = students;
    }

    public int getCourseDuration() {
	return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
    }

    public CourseTime getCourseTime() {
	return courseTime;
    }

    public void setCourseTime(CourseTime courseTime) {
	this.courseTime = courseTime;
    }

    @Override
    public String toString() {
	return "Course [mainTeacher=" + mainTeacher + ", secondTeacher=" + secondTeacher + ", courseName=" + courseName
		+ ", year=" + year + ", students=" + students + ", courseDuration=" + courseDuration + ", courseTime="
		+ courseTime + "]";
    }

}
