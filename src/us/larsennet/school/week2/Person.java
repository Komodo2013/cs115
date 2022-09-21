//**
//*File:lab2a
//* Description:
//Lessons Learned:
//* Construct 1
//* Construct 2
//* Instructor's Name: Barbara Chamberlin
//*
//@author: William Spencer, Jacob Larsen
//* since: 9/21/2022
//*/


package us.larsennet.school.week2;

import java.time.LocalDate;

public class Person {
	private String name;
	private String gender;
	private String phone;
	private LocalDate birthDate;

	public Person() {
		this.name = "John Doe";
		this.gender = "undef";
		this.phone = "000-000-0000";
		this.birthDate = LocalDate.parse("1900-01-01");
	}

	public Person(String n, String g, String p, String dob) {
	 this.name = n;
	 this.gender = g;
	 this.phone = p;
	 // Since dob will always be in ISO format "yyyy-mm-dd" we can just use standard parse without format
	 this.birthDate = LocalDate.parse(dob);
 }

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Since dob will always be in ISO format "yyyy-mm-dd" we can just use standard parse without format
	public void setBirthDate(String dob) {
		this.birthDate = LocalDate.parse(dob);
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
}//end of lab2a