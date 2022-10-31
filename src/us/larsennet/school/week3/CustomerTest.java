/*
 *File:lab 7b
 * Description: Static Fields
 * use a static field to share a value across objects
 * Lessons Learned:
 *   Static fields
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 31 Oct 2022
 */

package us.larsennet.school.week3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomerTest {

    @Test
    void getName() {
        Customer c = new Customer();
        assertEquals("Default Name", c.getName());
    }

    @Test
    void getID() {
        Customer c = new Customer();
        assertEquals(1001, c.getID());
    }

    @Test
    void setName() {
        Customer c = new Customer();
        c.setName("John Smith");
        assertEquals("John Smith", c.getName());
    }
}
