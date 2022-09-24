package us.larsennet.school.week2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MageliteUniversity {
    public static void main(String[] args) {
        String source = "in/data.txt";
        String deliminator = "\t";

        ArrayList<String[]> db = null;

        try {
            db = new MageliteDB(source, deliminator).getDB();
        } catch (FileNotFoundException e) {
            System.out.println("Error file: " + source + "does not exist");
            System.exit(404);
        }

        db.forEach(x -> System.out.println(String.join(" ", x)));

    }
}
