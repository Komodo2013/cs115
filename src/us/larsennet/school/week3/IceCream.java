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

public class IceCream extends DessertItem{
    private int scoops;
    private double pricePerScoop;

    public IceCream(String name, int scoops, double pricePerScoop) {
        super(name);
        this.setScoops(scoops);
        this.setPricePerScoop(pricePerScoop);
    }

    @Override
    double getPrice() {
        return scoops * pricePerScoop;
    }

    public IceCream() {
        super("IceCream");
        this.scoops = scoops = 0;
        this.pricePerScoop = 4.99;
    }

    public void setScoops(int scoops) {
        this.scoops = ((scoops <= 0) ? 1 : scoops);
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = ((pricePerScoop < 0) ? 4.99 : pricePerScoop);
    }

    public int getScoops() {
        return scoops;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }
}
