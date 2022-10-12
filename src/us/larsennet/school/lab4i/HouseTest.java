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

class HouseTest extends Residential {

    @Test
    void getYardAcres() {
        House t = new House("addr", "zip", 1, 1, 1, 2);
        assertEquals(2, t.getYardAcres());
    }

    @Test
    void setYardAcres() {
        House t = new House();
        t.setYardAcres(2);
        assertEquals(2, t.getYardAcres());
    }
}