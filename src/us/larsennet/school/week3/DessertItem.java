/*
 *File:lab 5a
 * Description:
 * Lessons Learned:
 *   overrides and UI
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * @since: 12 Oct 2022
 */

package us.larsennet.school.week3;


abstract class DessertItem {
    //Attributes
    private String name;
    private double taxRate = 0.0725;

    abstract double getPrice();
    public double getTax() {
        return getPrice() * taxRate;
    }

    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public double getTaxRate(){
        return taxRate;
    }

    //Constructors
    public DessertItem(String name) {
        this.setName(name);
    }

    public DessertItem() {
        name = "DessertItem";

    }// end of Constructor DessertItem()

    public void setName(String name) {
        String s = name.strip().toLowerCase();
        this.name = (s.equals("") ? "DessertItem" : s);
    }

    public String getName() {

        String[] parts = name.split(" ");
        String proper = "";

        for (String part : parts) {
            proper += part.toUpperCase().charAt(0) + part.substring(1) + " ";
        }

        return proper.strip();
    }
}
