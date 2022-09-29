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

    public int getCookieQty() {
        return cookieQty;
    }

    public double getPricePerCookie() {
        return pricePerCookie;
    }

    public void setcookieQty(int scoops) {
        this.cookieQty = ((scoops < 0) ? 1 : scoops);
    }

    public void setPricePerCookie(double pricePerCookie) {
        this.pricePerCookie = ((pricePerCookie < 0) ? 0 : pricePerCookie);
    }
}
