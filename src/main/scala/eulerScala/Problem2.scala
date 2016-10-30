package eulerScala

/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. 
 */
object Problem2 {
  def main(args: Array[String]): Unit = {

    def addNumbers(a: Int, b: Int, max: Int): Int = (a, b) match {
      case (a: Int, b: Int) if (b > max) => 0
      case (a: Int, b: Int) if (b % 2 == 0) => b + addNumbers(b, a + b, max)
    }

    val FOUR_MILLION = 4000000;
    var sum = addNumbers(0, 1, FOUR_MILLION)
    println(s"Sum of the even-valued terms is: " + sum)

  }

}
