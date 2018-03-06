import java.util
import java.util.Scanner

object Solution extends App {
  val scanner = new Scanner(System.in)
  val number = scanner.nextInt

  val arrayList = new util.ArrayList[Long]()

  for (i <- 1 to number) {
    arrayList.add(scanner.nextLong)
  }

  arrayList.forEach(x => println(sumOfEvenFibonacci(x)))

  def sumOfEvenFibonacci(maxNum: Long): Long = {
    var sum, currentEvenFib: Long = 2
    var previousEvenFid: Long = 0
    var newEvenFib: Long = currentEvenFib * 4 + previousEvenFid

    while (newEvenFib <= maxNum) {
      previousEvenFid = currentEvenFib
      currentEvenFib = newEvenFib
      sum += newEvenFib
      newEvenFib = currentEvenFib * 4 + previousEvenFid
    }

    sum
  }
}