package com.agilityroots.minesweeper;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MineFieldReaderTest {

    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        String path = getClass().getClassLoader().getResource("mines.ini").getPath();
        MineFieldReader mineFieldReader = new MineFieldReader();
        char[][] mineField = mineFieldReader.initialiseMineField(path);
        assertEquals("This mine field as 3 rows", 3, mineField.length);
        assertEquals("First cell is a mine", '*', mineField[0][0]);
    }

}
