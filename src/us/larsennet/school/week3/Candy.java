package us.larsennet.school.week3;

public class Candy extends DessertItem{
    private float candyweight;
    private double pricePerLb;

    public float getCandyweight() {
        return candyweight;
    }

    public double getPricePerLb() {
        return pricePerLb;
    }

    public void setcandyweight(float weight) {
        this.candyweight = ((weight < 0) ? 0 : weight);
    }

    public void setPricePerLb(double pricePerLb) {
        this.pricePerLb = ((pricePerLb < 0) ? 0 : pricePerLb);
    }
}
