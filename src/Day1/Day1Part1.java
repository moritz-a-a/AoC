package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class Day1Part1 {
    public static void main(String[] args) throws FileNotFoundException {

        Tuple<ArrayList<Integer>, ArrayList<Integer>> bothLists = importAndSortBothLists("/Users/moritzahlrichs/Documents/AdventOfCode2024/src/Day1/input.txt");

        ArrayList<Integer> leftList = bothLists.a();
        ArrayList<Integer> rightList = bothLists.b();

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

    public static Tuple<ArrayList<Integer>, ArrayList<Integer>> importAndSortBothLists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

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

        return new Tuple<>(leftList, rightList);
    }
}

record Tuple<A, B>(A a, B b) {}