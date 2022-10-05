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

public class Candy extends DessertItem{
    private double candyWeight;
    private double pricePerLb;

    public Candy(String name, double candyWeight, double pricePerLb) {
        super(name);
        this.setCandyWeight(candyWeight);
        this.setPricePerLb(pricePerLb);
    }

    @Override
    double getPrice() {
        return candyWeight * pricePerLb;
    }

    public Candy() {
        super("Candy");
        this.setCandyWeight(0.0);
        this.setPricePerLb(0.0);
    }

    public double getCandyWeight() {
        return candyWeight;
    }

    public double getPricePerLb() {
        return pricePerLb;
    }

    public void setCandyWeight(double weight) {
        this.candyWeight = ((weight < 0) ? 0 : weight);
    }

    public void setPricePerLb(double pricePerLb) {
        this.pricePerLb = ((pricePerLb < 0) ? 0 : pricePerLb);
    }
}
