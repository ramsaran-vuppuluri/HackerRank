/**
  * @author Ram Saran Vuppuluri
  *         Problem Statement
  * @see https://www.hackerrank.com/challenges/a-very-big-sum/problem
  */
package warmUp.Scala

import java.util.Scanner

object AVeryBigSum extends App {
  val scanner = new Scanner(System.in)

  val arraySize = scanner.nextInt()

  println(arraySize)

  var longSum: Long = 0
  for (i <- 0 to arraySize - 1) {
    longSum += scanner.nextLong()
  }

  println(longSum)
}
