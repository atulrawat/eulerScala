package eulerScala

import annotation.tailrec

/*
 * For which value of perimeter ≤ 1000, is the number of solutions maximised?
 * https://projecteuler.net/problem=39
 */
object Problem39 {
  def main(args: Array[String]): Unit = {

    println((1 to 999).toList.combinations(3).toList.filter( x => (x(0) * x(0)) + (x(1) * x(1)) == (x(2) * x(2))).filter(_.sum < 1000).groupBy(_.sum))
  }
}
