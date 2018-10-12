package com.agilityroots.minesweeper;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MineSweeperTest {

    @Test
    public void testAcceptanceInputFieldOne() throws IOException {
        char[][] mineField = new MineFieldReader().initialiseMineField(getClass().getClassLoader().getResource("acceptanceTestInput1.txt").getPath());
        MineSweeper mineSweeper = new MineSweeper();
        char[][] actual = mineSweeper.solve(mineField);
        Assert.assertEquals("Cells with mine remain unchanged", '*', actual[0][0]);
        Assert.assertEquals("Neighbouring Cells show number of mines", '1', actual[0][1]);
        Assert.assertEquals("Number of mines also includes diagonal neighbours", '2', actual[1][0]);
    }
}
