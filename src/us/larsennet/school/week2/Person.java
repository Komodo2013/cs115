package us.larsennet.school.week2;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String gender;
    private String phone;

    public Person() {
        this.name = "John Doe";
        this.birthDate = LocalDate.parse("1900-01-01");
        this.gender = "gender";
        this.phone = "000-000-0000";
    }

    public Person(String name, String dob, String gender, String phone) {
        this.name = name;
        this.birthDate = LocalDate.parse(dob);
        this.gender = gender;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String dob) {
        this.birthDate = LocalDate.parse(dob);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }
}
