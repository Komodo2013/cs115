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
        Sundae t = new Sundae("", 0, 0, "Testing");
        assertEquals(t.getTopping(), "testing");
    }
}