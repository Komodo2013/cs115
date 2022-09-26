package us.larsennet.school.week2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MageliteUniversity {
    public static void main(String[] args) {
        String source = "in/data.txt";
        String deliminator = "\t";

        ArrayList<Person> db = null;

        try {
            db = new MageliteDB(source, deliminator).getDB();
        } catch (FileNotFoundException e) {
            System.out.println("Error file: " + source + "does not exist");
            System.exit(404);
        }

        System.out.printf("%-23s\t%-12s\t%-12s\t%-12s\n", "Name", "Age", "Gender", "Phone Number");
        System.out.println("--------------------------------------------------------------------------------------");

        db.forEach(x -> System.out.println(x.toString()));



    }
}

/* alleluia
 * Name                  Age     Gender     Phone Number
 * ----------------------------------------------------------
 * Rachel                 28          F            801-555-1212
 * Jose                    16          M            480-555-1212
 * Prya                    20          F             385-555-1212
 * Bob                     37         M            801-555-1111
 */
