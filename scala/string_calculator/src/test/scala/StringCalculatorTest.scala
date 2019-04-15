import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

  @Test def testSumOfEmptyStringReturnsZero(): Unit = {
    assertEquals("Sum of empty string is zero", 0, add(""))
  }

  @Test def testSumOfSingleDigit(): Unit = {
    assertEquals("Sum of a digit is number itself", 5, add("5"))
  }

  def add(numbers: String): Int ={
    try {
      numbers.toInt
    } catch {
      case e: Exception => 0
    }
  }
}
