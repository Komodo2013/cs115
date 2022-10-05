/*
 *File:lab 4a and b
 * Description:
 * Lessons Learned:
 *   overrides and UI
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 5 Oct 2022
 */

package us.larsennet.school.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TODO: update this file with all added functions
class SundaeTest {

    @Test
    void setTopping() {
        Sundae t = new Sundae();
        t.setTopping("Testing");
        assertEquals("testing", t.getTopping());

        t.setTopping(" ");
        assertEquals("none", t.getTopping());
    }

    @Test
    void getTopping() {
        Sundae t = new Sundae("", 0, 0, "Testing", 0.0);
        assertEquals(t.getTopping(), "testing");
    }
}