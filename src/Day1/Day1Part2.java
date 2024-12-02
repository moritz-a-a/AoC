package Day1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class Day1Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Tuple<ArrayList<Integer>, ArrayList<Integer>> bothLists = Day1Part1.importAndSortBothLists("/Users/moritzahlrichs/Documents/AdventOfCode2024/src/Day1/input.txt");

        ArrayList<Integer> leftList = bothLists.a();
        ArrayList<Integer> rightList = bothLists.b();

        int similarityScore = 0;

        for (Integer leftValue : leftList) {
            int count = 0;
            for (Integer rightValue : rightList) {
                if (leftValue.equals(rightValue)) {
                    count++;
                }
            }
            similarityScore += leftValue * count;
        }
        System.out.println(similarityScore);
    }
}