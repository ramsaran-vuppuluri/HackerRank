/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
  */
package Eulers_Problems.Scala

import java.util
import java.util.Scanner

object MultipleOf3And5 extends App {
  val scanner = new Scanner(System.in)
  val numberOfIteration = scanner.nextLong()
  val listOfNumbers: util.ArrayList[Long] = new util.ArrayList[Long]()
  for (i <- BigInt(1) to numberOfIteration) {
    listOfNumbers.add(scanner.nextLong() - 1)
  }

  listOfNumbers.forEach(printSum(_))

  def printSum(longNumber: Long): Unit = {
    val longOne: Long = 1
    println((((longOne to longNumber / 3).sum) * 3) + (((longOne to longNumber / 5).sum) * 5) - (((longOne to longNumber / 15).sum)
      * 15))
  }
}