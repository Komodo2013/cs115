package us.larsennet.school.week3;

public class Candy {
    public class Candy extends DessertItem{
        private int candyweight;
        private double pricePerLb;

        public int getCandyweight() {
            return candyweight;
        }

        public double getPricePerLb() {
            return pricePerLb;
        }

        public void setcandyweight(int scoops) {
            this.candyweight = ((scoops < 0) ? 0 : scoops);
        }

        public void setPricePerLb(double pricePerLb) {
            this.pricePerLb = ((pricePerLb < 0) ? 0 : pricePerLb);
        }
    }

}
