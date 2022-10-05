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

public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerCookie;

    public Cookie() {
        super("Cookie");
        this.cookieQty = 0;
        this.pricePerCookie = 9.99;
    }

    public Cookie(String name, int quantity, double pricePerCookie) {
        super(name);
        this.cookieQty = quantity;
        this.pricePerCookie = pricePerCookie;
    }

    //TODO: getPrice Override

    public int getCookieQty() {
        return cookieQty;
    }

    public double getPricePerCookie() {
        return pricePerCookie;
    }

    public void setCookieQty(int cookies) {
        this.cookieQty = ((cookies < 0) ? 1 : cookies);
    }

    public void setPricePerCookie(double pricePerCookie) {
        this.pricePerCookie = ((pricePerCookie < 0) ? 0 : pricePerCookie);
    }
}
