package Day1.Day1Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class Day1Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/moritzahlrichs/Documents/AdventOfCode2024/src/Day1/input.txt");
        Scanner sc = new Scanner(file);

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        String[] parts;

        while (sc.hasNextLine()) {
            parts = sc.nextLine().split(" {3}");
            leftList.add(Integer.parseInt(parts[0]));
            rightList.add(Integer.parseInt(parts[1]));
        }

        sc.close();

        leftList.sort(null);
        rightList.sort(null);

        int diff = 0;

        if (leftList.size() == rightList.size()) {
            for (int i = 0; i < leftList.size(); i++) {
                if (leftList.get(i) > rightList.get(i)) {
                    diff += leftList.get(i) - rightList.get(i);
                } else {
                    diff += rightList.get(i) - leftList.get(i);
                }
            }
        }
        System.out.println(diff);
    }
}