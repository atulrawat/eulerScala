package eulerScala

/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. 
 */
 object Problem2 {
 	def main(args: Array[String]): Unit = {

 		var sum = 0
 		val FOUR_MILLION = 4000000;
 		addNumbers(0, 1, FOUR_MILLION)
 		println(s"Sum of the even-valued terms is: " + sum)

 		def addNumbers(a: Int, b: Int, max: Int): Unit = {
 			if (b >= max) return
 			if (b % 2 == 0) sum += b

 			addNumbers(b, a + b, max)
 		}
 	}

 }