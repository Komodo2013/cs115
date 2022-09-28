package us.larsennet.school.week3;

//Dessert Item
//09/27/2022

class DessertItem {
    //Attributes
    private String name;

    //Constructors
    public DessertItem(String name) {
        this.name = name;
    }

    public DessertItem() {
        name = "DessertItem";

    }// end of Constructor DessertItem()

    public void setName(String name) {

        //TODO setname valildation here

        this.name = name;
    }

    public String getName() {
        return name;
    }
}