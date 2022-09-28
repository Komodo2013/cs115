package us.larsennet.school.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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