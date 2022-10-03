/*
*File:lab3b
* Description: create order file
* Lessons Learned:
*   creating an object interfacing with other objects
* Instructor's Name: Barbara Chamberlin
*
* @author: William Spencer, Jacob Larsen, Oshane Stewart
* since: 10/03/2022
*/

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
