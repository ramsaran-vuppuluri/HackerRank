/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
 */
package Eulers_Problems.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleOf3And5 {
    public static void main(String... args) {
        Scanner sin = new Scanner(System.in);
        int numberOfParameters = sin.nextInt();
        List<Long> sumList = new ArrayList<Long>();
        for (int i = 0; i < numberOfParameters; i++) {
            long inputLong = sin.nextLong() - 1;
            sumList.add(sumCalc(inputLong));
        }

        for (long longVal : sumList) {
            System.out.println(longVal);
        }
    }

    private static long sumCalc(long inputLong) {
        return (sumOfFirstN(inputLong / 3) * 3) + (sumOfFirstN(inputLong / 5) * 5) - (sumOfFirstN(inputLong / 15) * 15);
    }

    /**
     * Using Mathematical Formula n*(n+1)/2
     *
     * @param n
     * @return
     */
    private static long sumOfFirstN(long n) {
        return n * (n + 1) / 2;
    }
}
