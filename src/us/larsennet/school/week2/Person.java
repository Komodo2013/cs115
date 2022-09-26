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
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	/**
	 * <h1>Person Constructor</h1>
	 * Creates a new person from validated string input
	 * <p>
	 * <b>Note:</b> Only accepts validated string
	 *
	 * @Param name - Name of the person
	 * @Param gender - String gender of the person
	 * @Param phone - String phone number
	 * @Param dob - Date in ISO format (yyyy-mm-dd)
	 */
	public Person(String name, String gender, String phone, String dob) {
	 this.name = name;
	 this.gender = gender;
	 this.phone = phone;
	 // Since dob will always be in ISO format "yyyy-mm-dd" we can just use standard parse without format
	 this.setBirthDate(dob);
 }

 	public String toString(){
		return this.name + "\t" + getAge() + "\t" + this.gender + "\t" + this.phone;
	}


	public static String rightPadding(String name, String getAge, String gender, String phone) {

		return String.format("%-23s %-12s %-12s %-12s", name, getAge, gender, phone);
	}


	public int getAge() {
		LocalDate curDate = LocalDate.now();
		if ((this.birthDate != null) && (curDate != null)) {
			return Period.between(this.birthDate, curDate).getYears();
		}
		else {
			return 0;
		}
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
	public void setBirthDate(String dob){
		Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher m = p.matcher(dob);
		boolean found = m.find();

		if(!found) {
			this.birthDate = LocalDate.parse("1000-01-01");
		} else {
			this.birthDate = LocalDate.parse(m.group());
		}
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