package com.agilityroots.minesweeper;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MineSweeperTest {

    @Test
    public void testAcceptanceInputFieldOne() throws IOException {
        List<Cell> mineField = new MineFieldReader().initialiseMineField(getClass().getClassLoader().getResource("acceptanceTestInput1.txt").getPath());
        List<Cell> expected = new MineFieldReader().initialiseMineField(getClass().getClassLoader().getResource("expectedOutput4AT1.txt").getPath());
        MineSweeper mineSweeper = new MineSweeper();
        List<Cell> actual = mineSweeper.solve(mineField);
        Assert.assertEquals("Cells with mine remain unchanged", expected.get(0).value,actual.get(0).value);
        Assert.assertEquals("Neighbouring Cells show number of mines", expected.get(1).value,actual.get(1).value);
    }
}
