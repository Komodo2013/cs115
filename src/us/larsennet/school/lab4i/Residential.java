package us.larsennet.school.lab4i;

public class Residential extends Property{
    private int bedCount;
    private double batchCount;
    private int sqFootage;

    public Residential(String streetAddress, String zip, int bedCount, double batchCount, int sqFootage) {
        super(streetAddress, zip);
        setBedCount(bedCount);
        setBatchCount(batchCount);
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

    public double getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(double batchCount) {
        this.batchCount = batchCount;
    }

    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }
}
