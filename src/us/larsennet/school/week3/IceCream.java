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

public class IceCream extends DessertItem{
    private int scoops;
    private double pricePerScoop;

    public IceCream(String name, int scoops, double pricePerScoop) {
        super(name);
        this.setScoops(scoops);
        this.setPricePerScoop(pricePerScoop);
        super.setPackaging("Bowl");

    }

    public String toString(){
        return String.format("%s\n\t%-45s$%3.2f\t[Tax: $%2.2f]", this.getName() + " (" + this.getPackaging() + ")",
                String.format("%4d @ $%3.2f", this.getScoops(), this.getPricePerScoop()),
                this.getPrice(), this.getTax());
    }

    @Override
    double getPrice() {
        return scoops * pricePerScoop;
    }

    public IceCream() {
        super("IceCream");
        this.scoops = scoops = 0;
        this.pricePerScoop = 4.99;
        super.setPackaging("Bowl");
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
