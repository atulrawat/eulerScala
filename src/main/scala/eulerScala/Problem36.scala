package eulerScala

import annotation.tailrec

/*
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 * https://projecteuler.net/problem=36
 */
object Problem36 {
  def main(args: Array[String]): Unit = {
    val sum = (1 to 999999).filter(x => isPalindrome(x.toString) && isPalindrome(x.toBinaryString)).map(x => {
      println(x + "\t" + x.toBinaryString)
      x
    }).sum
    println("The total sum of palindromic numbers is: " + sum)
  }

  def isPalindrome(str: String): Boolean = {  
    str.reverse == str
  }
}
