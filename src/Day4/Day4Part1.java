package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.StringJoiner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Day4Part1 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String[]> rows = importFile("src/Day4/input.txt");
        int xmasCount = 0;

        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).length; j++) {
                if (j < rows.get(i).length - 3 && rows.get(i)[j].equals("X") && rows.get(i)[j+1].equals("M") && rows.get(i)[j+2].equals("A") && rows.get(i)[j+3].equals("S"))
                    xmasCount++;
                if (j < rows.get(i).length - 3 && rows.get(i)[j].equals("S") && rows.get(i)[j+1].equals("A") && rows.get(i)[j+2].equals("M") && rows.get(i)[j+3].equals("X"))
                    xmasCount++;
                if (i < rows.size() - 3 && rows.get(i)[j].equals("X") && rows.get(i+1)[j].equals("M") && rows.get(i+2)[j].equals("A") && rows.get(i+3)[j].equals("S"))
                    xmasCount++;
                if (i < rows.size() - 3 && rows.get(i)[j].equals("S") && rows.get(i+1)[j].equals("A") && rows.get(i+2)[j].equals("M") && rows.get(i+3)[j].equals("X"))
                    xmasCount++;
                if (j < rows.get(i).length - 3 && i < rows.size() - 3 && rows.get(i)[j].equals("X") && rows.get(i+1)[j+1].equals("M") && rows.get(i+2)[j+2].equals("A") && rows.get(i+3)[j+3].equals("S"))
                    xmasCount++;
                if (j < rows.get(i).length - 3 && i < rows.size() - 3 && rows.get(i)[j].equals("S") && rows.get(i+1)[j+1].equals("A") && rows.get(i+2)[j+2].equals("M") && rows.get(i+3)[j+3].equals("X"))
                    xmasCount++;
                if (j < rows.get(i).length - 3 && i < rows.size() - 3 && rows.get(i+3)[j].equals("X") && rows.get(i+2)[j+1].equals("M") && rows.get(i+1)[j+2].equals("A") && rows.get(i)[j+3].equals("S"))
                    xmasCount++;
                if (j < rows.get(i).length - 3 && i < rows.size() - 3 && rows.get(i+3)[j].equals("S") && rows.get(i+2)[j+1].equals("A") && rows.get(i+1)[j+2].equals("M") && rows.get(i)[j+3].equals("X"))
                    xmasCount++;
            }
        }
        System.out.println(xmasCount);
    }

    static ArrayList<String[]> importFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String[]> rows = new ArrayList<>();
        String[] row;


        while (scanner.hasNextLine()) {
            row = scanner.nextLine().split("");
            rows.add(row);
        }

        scanner.close();
        return rows;
    }
}