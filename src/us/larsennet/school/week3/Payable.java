/*
 *File:lab 6b
 * Description: Payable interface
 * Lessons Learned:
 *   Enums
 * Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 19 Oct 2022
 */

package us.larsennet.school.week3;

public interface Payable {
    enum TYPES {
        CASH,
        CARD,
        PHONE
    }

    public TYPES getPayType();

    public void setPayType(TYPES t);
}
