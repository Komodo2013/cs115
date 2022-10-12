package us.larsennet.school.lab4i;

public class Property {
    private String streetAddress;
    private String zip;

    public Property(String streetAddress, String zip) {
        setStreetAddress(streetAddress);
        setZip(zip);
    }

    public Property() {
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
