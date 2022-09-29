//**
//*File:lab2a
//* Description:
//Lessons Learned:
//* Construct 1
//* Construct 2
//* Instructor's Name: Barbara Chamberlin
//*
//@author: William Spencer, Jacob Larsen
//* since: 9/21/2022
//*/

package us.larsennet.school.week3;

//Dessert Item
//09/27/2022

class DessertItem {
    //Attributes
    private String name;

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
        return name;
    }
}
