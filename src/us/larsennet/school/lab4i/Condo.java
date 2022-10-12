package us.larsennet.school.lab4i;

public class Condo extends Residential{
    private int floorLvl;

    public Condo(String streetAddress, String zip, int bedCount, double batchCount, int sqFootage, int floorLvl) {
        super(streetAddress, zip, bedCount, batchCount, sqFootage);
        setFloorLvl(floorLvl);
    }

    public Condo() {
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }
}
