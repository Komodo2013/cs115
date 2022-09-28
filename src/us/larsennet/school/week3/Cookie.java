package us.larsennet.school.week3;

public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerDozen;

    public Cookie() {
        super("IceCream");
        this.cookieQty = cookieQty = 0;
        this.pricePerDozen = pricePerDozen = 9.99;
    }

    public int getcookieQty() {
        return cookieQty;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setcookieQty(int scoops) {
        this.cookieQty = ((scoops < 0) ? 1 : scoops);
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = ((pricePerDozen < 0) ? 0 : pricePerDozen);
    }
}
