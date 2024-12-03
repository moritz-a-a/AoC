package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Day3Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        StringJoiner joiner = new StringJoiner("");

        while (scanner.hasNextLine()) {
            joiner.add(scanner.nextLine());
        }

        String input = joiner.toString();
        int res = 0;
        String[] muls = input.split(" ");


    }
}
