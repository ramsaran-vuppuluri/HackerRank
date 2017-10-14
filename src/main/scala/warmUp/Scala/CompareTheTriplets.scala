/**
  * @author Ram Saran Vuppuluri
  *         Problem statement
  * @see https://www.hackerrank.com/challenges/compare-the-triplets/problem
  */
package warmUp.Scala

object CompareTheTriplets {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in);
    val a0 = sc.nextInt();
    val a1 = sc.nextInt();
    val a2 = sc.nextInt();
    val b0 = sc.nextInt();
    val b1 = sc.nextInt();
    val b2 = sc.nextInt();

    var aScore = 0
    var bScore = 0

    if (a0 > b0) aScore += 1 else if (a0 < b0) bScore += 1
    if (a1 > b1) aScore += 1 else if (a1 < b1) bScore += 1
    if (a2 > b2) aScore += 1 else if (a2 < b2) bScore += 1

    println(s"$aScore $bScore")
  }
}
