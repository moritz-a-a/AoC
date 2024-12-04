package Day4;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.Scanner;
//import java.util.StringJoiner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Day4Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Day4/inputExample.txt");
        Scanner scanner = new Scanner(file);
        String input = "";

        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            System.out.println(input);
        }
    }
}