/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
package warmUp.Java;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String... args) {
        Scanner sin = new Scanner(System.in);
        Long sum = new Long(0);
        Long minVal = new Long(0);
        Long maxVal = new Long(0);
        for (String string : Arrays.asList(sin.nextLine().split(" "))) {
            Long value = new Long(string);
            if (minVal == 0) {
                minVal = value;
            } else if (value < minVal) {
                minVal = value;
            }
            if (maxVal == 0) {
                maxVal = value;
            } else if (value > maxVal) {
                maxVal = value;
            }
            sum += value;
        }

        System.out.println((sum - maxVal) + " " + (sum - minVal));
    }
}
