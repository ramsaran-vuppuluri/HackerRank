/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/time-conversion/problem
  */
package warmUp.Scala

import java.util.Scanner

object TImeConversion {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in);
    val timeIn = scanner.nextLine().trim
    val timeArray: Array[String] = timeIn.substring(0, 8).split(":")
    if (timeIn.substring(8).toUpperCase == "AM") {
      if (timeArray(0).toInt == 12) {
        println(s"00:${timeArray(1)}:${timeArray(2)}")
      } else {
        println(timeIn.substring(0, 8))
      }
    } else {
      if (timeArray(0).toInt == 12) {
        println(timeIn.substring(0, 8))
      } else {
        println(s"${timeArray(0).toInt + 12}:${timeArray(1)}:${timeArray(2)}")
      }
    }
  }
}