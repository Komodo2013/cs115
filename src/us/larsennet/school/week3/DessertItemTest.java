/*
 *File:lab3a
 * Description:
 * Lessons Learned:
 *   Classes
 *   Sub-Classes
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 9/28/2022
 */

package us.larsennet.school.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TODO: update this file with all added functions
class DessertItemTest {

    @Test
    void setName() {
        DessertItem t = new DessertItem();
        t.setName("Testing");
        assertEquals("testing", t.getName());

        t.setName(" ");
        assertEquals("DessertItem", t.getName());
    }

    @Test
    void getName() {
        DessertItem t = new DessertItem("Testing");
        assertEquals(t.getName(), "testing");
    }
}