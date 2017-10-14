/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see
 */
package warmUp.Java;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String... args) {
        Scanner sin = new Scanner(System.in);
        int arraySize = sin.nextInt();
        int positiveSum = 0;
        int negativeSum = 0;
        int zeroSum = 0;

        for (int i = 0; i < arraySize; i++) {
            int nextInt = sin.nextInt();
            if (nextInt > 0) {
                positiveSum++;
            } else if (nextInt < 0) {
                negativeSum++;
            } else {
                zeroSum++;
            }
        }

        System.out.println((positiveSum * 1.0) / arraySize);
        System.out.println((negativeSum * 1.0) / arraySize);
        System.out.println((zeroSum * 1.0) / arraySize);
    }
}
