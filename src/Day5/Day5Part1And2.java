package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day5Part1And2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Day5/input.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String[]> updates = new ArrayList<>();
        boolean emptyLine = false;
        String line;
        String[] updateLine;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.isEmpty()) emptyLine = true;
            if (!emptyLine) rules.add(line);
            if (emptyLine && !line.isEmpty()) {
                updateLine = line.split(",");
                updates.add(updateLine);
            }
        } scanner.close();

        for (String rule : rules) {
            System.out.println(rule);
        }
        System.out.println();
        for (String[] update : updates) {
            for (String page : update) {
                System.out.print(page);
            }
            System.out.println();
        }
        boolean[] correctlyOrdered = new boolean[updates.size()];
        Arrays.fill(correctlyOrdered, true);

        for (int i = 0; i < updates.size(); i++) {
            for (int j = 0; j < updates.get(i).length-1; j++) {
                //check for each combination of pages if the reverse order exists in rules and if yes then return wrong
                for (int k = j+1; k < updates.get(i).length; k++) {
                    for (String rule : rules) {
                        if (rule.equals(updates.get(i)[k] + "|" + updates.get(i)[j])) {
                            correctlyOrdered[i] = false;
                            break;
                        }
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < correctlyOrdered.length; i++) {
            if (correctlyOrdered[i]) {
                sum += Integer.parseInt(updates.get(i)[updates.get(i).length/2]);
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
