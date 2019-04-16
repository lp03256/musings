import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

  @Test def testSumOfEmptyStringReturnsZero(): Unit = {
    assertEquals("Sum of empty string is zero", 0, add(""))
  }

  @Test def testSumOfSingleDigit(): Unit = {
    assertEquals("Sum of a digit is number itself", 5, add("5"))
  }

  @Test def testSumOfTwoDigits(): Unit = {
    assertEquals("Sum of a digit is number itself", 9, add("4,5"))
  }

  def add(numbers: String): Int ={
    if(!numbers.isEmpty)
      numbers.split(",").map(i => i.toInt).sum
    else
      0
  }
}
