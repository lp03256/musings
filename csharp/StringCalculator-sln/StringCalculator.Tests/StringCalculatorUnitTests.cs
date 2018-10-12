using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace StringCalculator.Tests
{
    [TestClass]
    public class StringCalculatorUnitTests
    {
        [TestMethod]
        public void TestSumOfEmptyStringIsZero()
        {
            StringCalculator.Addition calculator = new StringCalculator.Addition();
            Assert.AreEqual(calculator.Add(""), 0);
        }

        [TestMethod]
        public void TestSumOfNumberIsNumberIsItself()
        {
            StringCalculator.Addition calculator = new StringCalculator.Addition();
            Assert.AreEqual(calculator.Add("4"), 4);
        }
    }
}
