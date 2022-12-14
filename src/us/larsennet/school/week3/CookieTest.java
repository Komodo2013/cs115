/*
 *File:lab 7a
 * Description:
 * Lessons Learned:
 *   instancing
 *   casting
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 25 Oct 2022
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
        assertEquals(1, c.getCookieQty());
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

    @Test
    void getPrice() {
        Cookie t = new Cookie("", 3, .5);
        assertEquals(1.5, t.getPrice());
    }
    @Test
    void testIsSameAs() {
        Cookie c = new Cookie("", 0, 0);
        Cookie other = new Cookie("", 0, 0);
        assertEquals(true, c.isSameAs(other));
    }

    @Test
    void testisSameAs() {
        Cookie c = new Cookie("", 0, 0);
        Cookie other = new Cookie("", 0, 0);
        assertEquals(false, c.isSameAs(other));
    }


}