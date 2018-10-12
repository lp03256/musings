using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace StringCalculator.Tests
{
    [TestClass]
    public class StringCalculatorUnitTests
    {

        StringCalculator.Addition calculator; 

        [TestInitialize]
        public void InitializeTest()
        {
            calculator = new StringCalculator.Addition();
        }
        [TestMethod]
        public void TestSumOfEmptyStringIsZero()
        {
            Assert.AreEqual(calculator.Add(""), 0);
        }

        [TestMethod]
        public void TestSumOfASingleNumberIsItself()
        {
            Assert.AreEqual(calculator.Add("4"), 4);
        }

        [TestMethod]         public void TestCanSumTwoCommaSeparatedNumbers()         {             Assert.AreEqual(calculator.Add("4,3"), 7);         }

    }
}
