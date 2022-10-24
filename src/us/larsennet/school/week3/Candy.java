/*
 *File:lab 5a
 * Description:Interfaces
 * Lessons Learned:
 *   Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 17 Oct 2022
 */

//Testing
//testing

package us.larsennet.school.week3;

public class Candy extends DessertItem implements Packaging{
    private double candyWeight;
    private double pricePerLb;

    public Candy(String name, double candyWeight, double pricePerLb) {
        super(name);
        this.setCandyWeight(candyWeight);
        this.setPricePerLb(pricePerLb);
        super.setPackaging("Bag");
    }

    public String toString(){
        return String.format("%s\n\t%-45s$%3.2f\t[Tax: $%2.2f]", this.getName() + " (" + this.getPackaging() + ")",
                String.format("%2.2f lbs @ $%3.2f/lbs", this.getCandyWeight(), this.getPricePerLb()),
                this.getPrice(), this.getTax());
    }

    @Override
    double getPrice() {
        return candyWeight * pricePerLb;
    }

    public Candy() {
        super("Candy");
        this.setCandyWeight(0.0);
        this.setPricePerLb(0.0);
        super.setPackaging("Bag");

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
