/*
 *File:lab 6b
 * Description: Use an existing Java library Interface
Implement the Comparable interface in a class you create
Sort an array of objects using the data members of a class
 * Lessons Learned:
 *   Comparable
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 24 Oct 2022
 */

package us.larsennet.school.week3;


import org.testng.internal.collections.Pair;

abstract class DessertItem implements Packaging, Comparable<DessertItem>, SameAs{
    //Attributes
    private String name;
    private double taxRate = 0.0725;
    private String packaging;

    @Override
    public boolean isSameAs(DessertItem T){
        return false;
    }

    @Override
    public int compareTo(DessertItem item) {
        return Double.compare(this.getPrice(), item.getPrice());
    }

    @Override
    public String getPackaging() {
        return packaging;
    }

    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

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
