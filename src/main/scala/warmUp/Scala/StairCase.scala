/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/staircase/problem
  */
package warmUp.Scala

import java.util.Scanner

object StairCase {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val length = scanner.nextInt()
    for (i <- 1 to length) {
      println(getPrefixString(i, length).concat(getSuffixString(i, length)))
    }
  }

  def getPrefixString(i: Int, length: Int): String = {
    val stringBuilder = new StringBuilder
    for (j <- 1 to (length - i)) {
      stringBuilder.append(" ")
    }
    stringBuilder.toString()
  }

  def getSuffixString(i: Int, length: Int): String = {
    val stringBuilder = new StringBuilder
    for (j <- 1 to i) {
      stringBuilder.append("#")
    }
    stringBuilder.toString()
  }
}
