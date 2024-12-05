package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Day5/inputExample.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> updates = new ArrayList<>();
        boolean emptyLine = false;
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.isEmpty()) emptyLine = true;
            if (!emptyLine) rules.add(line);
            else if (!line.isEmpty()) updates.add(line);
        } scanner.close();

        for (String rule : rules) {
            System.out.println(rule);
        }
        System.out.println();
        for (String update : updates) {
            System.out.println(update);
        }

        String[] pages;

        for (int i = 0; i < updates.size(); i++) {
            pages = updates.get(i).split(",");
            for (int j = 0; j < pages.length; j++) {
                //check for each combination of pages if the reverse order exists in rules and if yes then return wrong
            }
        }
    }
}
