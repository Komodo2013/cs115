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

class CondoTest extends Residential {

    @Test
    void getFloorLvl() {
        Condo t = new Condo("addr", "zip", 1, 1, 1, 2);
        assertEquals(2, t.getFloorLvl());
    }

    @Test
    void setFloorLvl() {
        Condo t = new Condo();
        t.setFloorLvl(2);
        assertEquals(2, t.getFloorLvl());
    }
}