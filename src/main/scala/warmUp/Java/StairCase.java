/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see https://www.hackerrank.com/challenges/staircase/problem
 */
package warmUp.Java;

import java.util.Scanner;

public class StairCase {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        for (int i = 1; i <= length; i++) {
            System.out.println(getPrefixString(i, length).concat(getSuffixString(i, length)));
        }
    }

    private static String getPrefixString(int i, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        if ((length - i) == 0) {
            return "";
        }
        for (int j = 1; j <= (length - i); j++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String getSuffixString(int i, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stringBuilder.append("#");
        }
        return stringBuilder.toString();
    }
}