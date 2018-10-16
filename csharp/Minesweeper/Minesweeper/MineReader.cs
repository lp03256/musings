using System;

namespace Minesweeper
{
    public class MineReader
    {
        public char[,] InitialiseMine(String size)
        {
            String[] dimensions = size.Split(' ');
            return new char[Int32.Parse(dimensions[0]), Int32.Parse(dimensions[1])];
        }
    }
}
