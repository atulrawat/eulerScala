package eulerScala

/*
* Find the largest palindrome made from the product of two 3-digit numbers
*/
object Problem4 {
	def main(args: Array[String]): Unit = {

		var tuple = for (
			a <- 100 to 999;
			b <- 100 to 999
		) yield (a, b)

		var maxProd = 0
		tuple.filter( x => isPalindrome(x._1 * x._2)).foreach( y => if(y._1 * y._2 > maxProd) maxProd =  y._1 * y._2)
		println(s"Max product of two 3-digit numbers is: " + maxProd)
	}

	def isPalindrome(num: Int) : Boolean = {
		num.toString.reverse == num.toString 
	}

}