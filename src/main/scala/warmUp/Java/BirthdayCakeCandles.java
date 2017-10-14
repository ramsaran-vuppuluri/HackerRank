/**
 * @author Ram Saran Vuppuluri
 * Problem Statement
 * @see https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
package warmUp.Java;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String... args) {
        Scanner sin = new Scanner(System.in);
        sin.nextLine();
        int max = 0;
        int maxValCount = 0;
        for (String str : sin.nextLine().split(" ")) {
            int value = Integer.parseInt(str);
            if (max == 0) {
                max = value;
                ++maxValCount;
            } else if (max < value) {
                max = value;
                maxValCount = 1;
            } else if (max == value) {
                ++maxValCount;
            }

        }
        System.out.println(maxValCount);
    }
}
