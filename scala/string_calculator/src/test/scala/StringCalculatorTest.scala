import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

  @Test def testSumOfEmptyStringReturnsZero(): Unit = {
    assertEquals("Sum of empty string is zero", 0, add(""))
  }

  def add(str: String) ={
    0;
  }
}
