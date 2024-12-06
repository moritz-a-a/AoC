package Day4;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static Day4.Day4Part1.importFile;

public class Day4Part2 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String[]> rows = importFile("src/Day4/input.txt");
        int xmasCount = 0;

        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).length; j++) {
                if (j < rows.get(i).length - 2 && i < rows.size() - 2 && rows.get(i)[j].equals("M") && rows.get(i+1)[j+1].equals("A") && rows.get(i+2)[j+2].equals("S") && rows.get(i+2)[j].equals("M") && rows.get(i)[j+2].equals("S"))
                    xmasCount++;
                if (j < rows.get(i).length - 2 && i < rows.size() - 2 && rows.get(i)[j].equals("M") && rows.get(i+1)[j+1].equals("A") && rows.get(i+2)[j+2].equals("S") && rows.get(i+2)[j].equals("S") && rows.get(i)[j+2].equals("M"))
                    xmasCount++;
                if (j < rows.get(i).length - 2 && i < rows.size() - 2 && rows.get(i)[j].equals("S") && rows.get(i+1)[j+1].equals("A") && rows.get(i+2)[j+2].equals("M") && rows.get(i+2)[j].equals("M") && rows.get(i)[j+2].equals("S"))
                    xmasCount++;
                if (j < rows.get(i).length - 2 && i < rows.size() - 2 && rows.get(i)[j].equals("S") && rows.get(i+1)[j+1].equals("A") && rows.get(i+2)[j+2].equals("M") && rows.get(i+2)[j].equals("S") && rows.get(i)[j+2].equals("M"))
                    xmasCount++;
            }
        }
        System.out.println(xmasCount);
    }
}