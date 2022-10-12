package us.larsennet.school.lab4i;

public class House extends Residential {
    private double yardAcres;

    public House(String streetAddress, String zip, int bedCount, double batchCount, int sqFootage, double yardAcres) {
        super(streetAddress, zip, bedCount, batchCount, sqFootage);
        setYardAcres(yardAcres);
    }

    public House() {
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }
}
