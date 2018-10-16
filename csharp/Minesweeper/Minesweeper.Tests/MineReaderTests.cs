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
        }
    }
}
