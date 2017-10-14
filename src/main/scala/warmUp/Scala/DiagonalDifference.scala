/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/diagonal-difference/problem
  */
package warmUp.Scala

import java.util.Scanner

object DiagonalDifference extends App {
  val scanner = new Scanner(System.in)
  val matrixDimension = scanner.nextInt()
  var diagnal1Sum = 0
  var diagnal2Sum = 0
  for (
    i <- 1 to matrixDimension;
    j <- 1 to matrixDimension
  ) {
    var nextInt: Int = scanner.nextInt()
    if (i == j) {
      diagnal1Sum += nextInt
    }
    if ((i + j) == (matrixDimension + 1)) {
      diagnal2Sum += nextInt
    }
  }

  if ((diagnal1Sum - diagnal2Sum) >= 0) {
    println(diagnal1Sum - diagnal2Sum)
  } else {
    println(((diagnal1Sum - diagnal2Sum) * (-1)))
  }
}