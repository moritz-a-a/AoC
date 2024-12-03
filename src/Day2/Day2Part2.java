package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static Day2.Day2Part1.isSafe;

public class Day2Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/moritzahlrichs/Documents/AdventOfCode2024/src/Day2/input.txt");

        Scanner sc = new Scanner(file);

        ArrayList<Integer> list = new ArrayList<>();
        String[] parts;

        int safeCounter = 0;
        while (sc.hasNextLine()) {
            parts = sc.nextLine().split(" ");
            list.clear();
            for (String part : parts) {
                list.add(Integer.parseInt(part));
            }
            if (list.size() == 1) {
                safeCounter++;
            } else {
                boolean safe = isSafe(list);
                if (!safe) {
                    safe = isSafeWithLevelDampener(list);
                }
                if (safe) {
                    safeCounter++;
                }
            }
        }

        sc.close();

        System.out.println(safeCounter);
    }

    static boolean isSafeWithLevelDampener(ArrayList<Integer> list) {
        boolean safe;
        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            removeList.addAll(list);
            removeList.remove(i);
            safe = isSafe(removeList);
            if (safe) return true;
            removeList.clear();
        }
        return false;
    }
}
