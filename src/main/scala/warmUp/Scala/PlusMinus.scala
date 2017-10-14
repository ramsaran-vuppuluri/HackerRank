/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/plus-minus/problem
  */
package warmUp.Scala

import java.util.Scanner

object PlusMinus extends App {
  val scanner = new Scanner(System.in)
  val arraySize = scanner.nextInt()

  var negativeCount = 0
  var positiveCount = 0
  var zeroCount = 0

  for (i <- 1 to arraySize) {
    val nextInt = scanner.nextInt()
    if (nextInt > 0)
      positiveCount += 1
    if (nextInt < 0)
      negativeCount += 1
    if (nextInt == 0)
      zeroCount += 1
  }

  println((positiveCount * 1.0) / arraySize)
  println((negativeCount * 1.0) / arraySize)
  println((zeroCount * 1.0) / arraySize)
}
