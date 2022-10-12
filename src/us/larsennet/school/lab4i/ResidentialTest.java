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

class ResidentialTest {

    @Test
    void getBedCount() {
        Residential t = new Residential("addr", "zip", 1, 1, 1);
        assertEquals(1, t.getBedCount());
    }

    @Test
    void setBedCount() {
        Residential t = new Residential();
        t.setBedCount(1);
        assertEquals(1, t.getBedCount());
    }

    @Test
    void getBathCount() {
        Residential t = new Residential("addr", "zip", 1, 1, 1);
        assertEquals(1, t.getBathCount());
    }

    @Test
    void setBathCount() {
        Residential t = new Residential();
        t.setBathCount(1);
        assertEquals(1, t.getBathCount());
    }

    @Test
    void getSqFootage() {
        Residential t = new Residential("addr", "zip", 1, 1, 1);
        assertEquals(1, t.getSqFootage());
    }

    @Test
    void setSqFootage() {
        Residential t = new Residential();
        t.setSqFootage(1);
        assertEquals(1, t.getSqFootage());
    }
}