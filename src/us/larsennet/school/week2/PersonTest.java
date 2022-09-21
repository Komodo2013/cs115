/**
* File:lab2b
* Description:
* Lessons Learned:
*     Construct 1
*     Construct 2
* Instructor's Name: Barbara Chamberlin
*
* @author: William Spencer, Jacob Larsen
* since: 9/21/2022

getName()
        getDOB()
        getGender()
        getPhone()
        setName(String)
        setDOB(String)
        setGender(String)
        setPhone(String)
*/

package us.larsennet.school.week2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testGetName(){
        Person p = new Person("John Smith", "M", "801-561-5941", "1955-07-23");
        assertEquals("John Smith", p.getName(), "Get Name was incorrect");
    }

    @Test
    public void testGetGender(){
        Person p = new Person("John Smith", "M", "801-561-5941", "1955-07-23");
        assertEquals("M", p.getGender(), "Get Gender was incorrect");
    }

    @Test
    public void testGetPhone(){
        Person p = new Person("John Smith", "M", "801-561-5941", "1955-07-23");
        assertEquals("801-561-5941", p.getPhone(), "Get Phone was incorrect");
    }

    @Test
    public void testGetDOB(){
        Person p = new Person("John Smith", "M", "801-561-5941", "1955-07-23");
        assertEquals(LocalDate.parse("1955-07-23"), p.getBirthDate(), "Get DOB was incorrect");
    }

    @Test
    public void testSetName(){
        Person p = new Person();
        p.setName("Juan Esmith");
        assertEquals("Juan Esmith", p.getName(), "Set name failed");
    }


    @Test
    public void testSetGender(){
        Person p = new Person();
        p.setGender("Male");
        assertEquals("Male", p.getGender(), "Set gender failed");
    }

    @Test
    public void testSetPhone(){
        Person p = new Person();
        p.setPhone("801-550-9948");
        assertEquals("801-550-9948", p.getPhone(), "Set phone failed");
    }

    @Test
    public void testSetDOB(){
        Person p = new Person();
        p.setBirthDate("2001-06-05");
        assertEquals(LocalDate.parse("2001-06-05"), p.getBirthDate(), "DOB failed");
    }


}
