package us.larsennet.school.week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MageliteDB {

    private final ArrayList<String[]> DB = new ArrayList<>();

    public MageliteDB(String source, String deliminator) throws FileNotFoundException {
        File tsv = new File(source);
        Scanner sc = new Scanner(tsv);

        while(sc.hasNextLine()) {
            this.DB.add(sc.nextLine().split(deliminator));
        }
    }

    public ArrayList<String[]> getDB() {
        return DB;
    }
}
