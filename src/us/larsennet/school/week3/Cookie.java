/*
 *File:lab 5a
 * Description: Interfaces
 * Lessons Learned:
 *   Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 17 Oct 2022
 */

package us.larsennet.school.week3;

public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerCookie;

    @Override
    double getPrice() {
        return cookieQty * pricePerCookie;
    }

    public String toString(){
        return String.format("%s\n\t%-45s$%3.2f\t[Tax: $%2.2f]", this.getName() + " (" + this.getPackaging() + ")",
                String.format("%4d @ $%3.2f", this.getCookieQty(), this.getPricePerCookie()),
                this.getPrice(), this.getTax());

    }

    public Cookie() {
        super("Cookie");
        this.cookieQty = 0;
        this.pricePerCookie = 9.99;
        super.setPackaging("Box");
    }

    public Cookie(String name, int quantity, double pricePerCookie) {
        super(name);
        this.cookieQty = quantity;
        this.pricePerCookie = pricePerCookie;
        super.setPackaging("Box");
    }

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
