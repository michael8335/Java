package com.yf.ioc;

public class Student {
	private String name;
	private String number;
	private Teacher teacher;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
}
