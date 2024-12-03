package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/moritzahlrichs/Documents/AdventOfCode2024/src/Day2/inputExample.txt");

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
                boolean safe = isSafeWithLevelDampener(list);
                if (safe) {
                    safeCounter++;
                }
            }
        }

        sc.close();

        System.out.println(safeCounter);
    }

    static boolean isSafeWithLevelDampener(ArrayList<Integer> list) {
        boolean increasing;
        increasing = list.get(1) > list.get(0);
        boolean safe = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (increasing && ((list.get(i+1) <= list.get(i)) || ((list.get(i+1) - list.get(i)) > 3))) {
                safe = false;
            } else if (!increasing && ((list.get(i + 1) >= list.get(i)) || ((list.get(i) - list.get(i + 1)) > 3))) {
                safe = false;
            }
        }
        return safe;
    }
}
