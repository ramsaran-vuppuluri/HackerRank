/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
package warmUp.Java;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int matrixDimension = scanner.nextInt();
        int sumOfDimension1 = 0;
        int sumOfDimension2 = 0;

        for (int i = 1; i <= matrixDimension; i++) {
            for (int j = 1; j <= matrixDimension; j++) {
                int nextInt = scanner.nextInt();
                if (i == j) {
                    sumOfDimension1 += nextInt;
                }
                if ((i + j) == (matrixDimension + 1)) {
                    sumOfDimension2 += nextInt;
                }
            }
        }

        if ((sumOfDimension1 - sumOfDimension2) >= 0) {
            System.out.println(sumOfDimension1 - sumOfDimension2);
        } else {
            System.out.println((sumOfDimension1 - sumOfDimension2) * -1);
        }
    }
}
