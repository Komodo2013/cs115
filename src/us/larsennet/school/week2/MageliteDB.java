package us.larsennet.school.week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MageliteDB {

    private final ArrayList<Person> DB = new ArrayList<>();

    public MageliteDB(String source, String deliminator) throws FileNotFoundException {
        File tsv = new File(source);
        Scanner sc = new Scanner(tsv);

        while(sc.hasNextLine()) {
            String[] entry = sc.nextLine().split(deliminator);
            this.DB.add(new Person(entry[0], entry[2], entry[3], entry[1]));
        }

    }

    public ArrayList<Person> getDB() {
        return DB;
    }
}
