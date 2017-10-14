/**
 * @author Ram Saran Vuppuluri
 * Problem Statement
 * @see https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
package warmUp.Java;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String... args) {
        Scanner sin = new Scanner(System.in);

        int arraySize = sin.nextInt();
        long sumArray = 0;
        for (int i = 0; i < arraySize; i++) {
            sumArray += sin.nextLong();
        }
        System.out.println(sumArray);
    }
}
