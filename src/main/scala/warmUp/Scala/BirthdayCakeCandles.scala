/**
  * @author Ram Saran Vuppuluri
  *         Problem Statement
  * @see https://www.hackerrank.com/challenges/birthday-cake-candles/problem
  */
package warmUp.Scala

import java.util.Scanner

object BirthdayCakeCandles {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    scanner.nextLine()
    val array: Array[Int] = scanner.nextLine().split(" ").map(string => string.toInt)
    val arrayMax = array.max
    println(array.count(_ == arrayMax))
  }
}