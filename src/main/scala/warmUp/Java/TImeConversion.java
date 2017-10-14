/**
 * @author Ram Saran Vuppuluri
 * Problem statement
 * @see https://www.hackerrank.com/challenges/time-conversion/problem
 */
package warmUp.Java;

import java.util.Scanner;

public class TImeConversion {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String timeIn = in.nextLine().trim();
        if (timeIn.substring(8).toUpperCase().equals("AM")) {
            if ((timeIn.split(":")[0]).equals("12")) {
                System.out.println("00:" + timeIn.substring(3, 8));
            } else {
                System.out.println(timeIn.substring(0, 8));
            }
        } else {
            if ((timeIn.split(":")[0]).equals("12")) {
                System.out.println(timeIn.substring(0, 8));
            } else {
                System.out.println((Integer.parseInt(timeIn.split(":")[0]) + 12) + ":" + timeIn.substring(3, 8));
            }
        }

    }
}
