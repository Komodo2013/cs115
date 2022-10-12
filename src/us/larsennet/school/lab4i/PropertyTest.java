/*
 *File:lab 4i
 * Description:
 * Lessons Learned:
 *   class structure
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Jacob Larsen
 * @since: 12 Oct 2022
 */

package us.larsennet.school.lab4i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest extends Residential {

    @Test
    void testGetStreetAddress() {
        Property t = new Property("addr", "zip");
        assertEquals("addr", t.getStreetAddress());
    }

    @Test
    void testSetStreetAddress() {
        Property t = new Property();
        t.setStreetAddress("addr");
        assertEquals("addr", t.getStreetAddress());
    }

    @Test
    void testGetZip() {
        Property t = new Property("addr", "zip");
        assertEquals("zip", t.getZip());
    }

    @Test
    void testSetZip() {
        Property t = new Property();
        t.setZip("zip");
        assertEquals("zip", t.getZip());
    }
}