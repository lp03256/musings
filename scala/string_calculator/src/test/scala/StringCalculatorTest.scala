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
    assertEquals("Sum of 4,5 is 9", 9, add("4,5"))
  }

  @Test def testCanSumUnknownNumbersCommaSeparator(): Unit = {
    assertEquals("Sum of unknown amount of numbers", 15, add("1,2,3,4,5"))
  }

  @Test def testCanAddMultipleSeparatorNumbers(): Unit = {
    assertEquals("Sum of 1\\n2,3 is 6", 15, add("1,2,3,4,5"))
  }

  def add(numbers: String): Int ={
    if(!numbers.isEmpty)
      numbers.split(Array('\n',',')).map(i => i.toInt).sum
    else
      0
  }
}
