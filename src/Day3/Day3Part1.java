package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Day3Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Day3/input.txt");
        Scanner scanner = new Scanner(file);
        StringJoiner joiner = new StringJoiner("");

        while (scanner.hasNextLine()) {
            joiner.add(scanner.nextLine());
        }

        String input = joiner.toString();
        ArrayList<String> muls = new ArrayList<>();

        Pattern pattern = Pattern.compile("mul[(][0-9]{1,3},[0-9]{1,3}[)]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            muls.add(matcher.group());
        }

        String commaNums = "";
        String[] nums;
        Pattern pattern2 = Pattern.compile("[0-9]{1,3},[0-9]{1,3}");

        int sumOfMuls = 0;
        int mulRes;

        for (String mul : muls) {
            matcher = pattern2.matcher(mul);
            if (matcher.find()) {
                commaNums = matcher.group();
            }
            nums = commaNums.split(",");
            mulRes = Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
            sumOfMuls += mulRes;
        }
        System.out.println(sumOfMuls);
    }
}
