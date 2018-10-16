using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Minesweeper.Tests
{
    [TestClass]
    public class MineReaderTests
    {
        [TestMethod]
        public void TestInitialisesMine()
        {
            Minesweeper.MineReader reader = new Minesweeper.MineReader();
            char [,] mine = reader.InitialiseMine("4 4");
            Assert.AreEqual(16, mine.Length, "Creates a mine of length 16 for input \"4 4\"");
        }
    }
}
