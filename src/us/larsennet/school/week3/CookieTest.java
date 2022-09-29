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

class CookieTest {

    @Test
    void getCookieQty() {
        Cookie c = new Cookie();
        c.setCookieQty(12);
        assertEquals(12, c.getCookieQty());
        c.setCookieQty(-12);
        assertEquals(0, c.getCookieQty());
    }

    @Test
    void getPricePerCookie() {
        Cookie c = new Cookie();
        c.setPricePerCookie(12.00);
        assertEquals(12.00, c.getPricePerCookie());
        c.setPricePerCookie(-12.00);
        assertEquals(0.00, c.getPricePerCookie());
    }

    @Test
    void setCookieQty() {
        Cookie c = new Cookie("", 12, 22.6);
        assertEquals(12, c.getCookieQty());
    }

    @Test
    void setPricePerCookie() {
        Cookie c = new Cookie("", 12, 22.7);
        assertEquals(22.7, c.getPricePerCookie());
    }
}