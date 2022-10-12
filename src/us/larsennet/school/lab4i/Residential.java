package us.larsennet.school.lab4i;

public class Residential extends Property{
    private int bedCount;
    private double bathCount;
    private int sqFootage;

    public Residential(String streetAddress, String zip, int bedCount, double bathCount, int sqFootage) {
        super(streetAddress, zip);
        setBedCount(bedCount);
        setBathCount(bathCount);
        setSqFootage(sqFootage);
    }

    public Residential() {
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public double getBathCount() {
        return bathCount;
    }

    public void setBathCount(double bathCount) {
        this.bathCount = bathCount;
    }

    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }
}
