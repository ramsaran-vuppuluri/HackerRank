/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/mini-max-sum/problem
  */
package warmUp.Scala

import java.util.Scanner

object MinMaxSum {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in);
    val longArray = scanner.nextLine().split(" ").map(string => string.toLong)
    val sum = longArray.sum
    println((sum - longArray.max) + " " + (sum - longArray.min))
  }
}
