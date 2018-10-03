package com.agilityroots.minesweeper;

import com.agilityroots.minesweeper.MineFieldReader;
import org.junit.Test;
import java.io.IOException;
import java.util.List;


import static org.junit.Assert.*;

public class MineFieldReaderTest {

    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        String path = getClass().getClassLoader().getResource("mines.ini").getPath();
        MineFieldReader mineFieldReader = new MineFieldReader();
        List<Cell> mineField = mineFieldReader.initialiseMineField(path);
        assertEquals("This mine field as 9 cells", 9, mineField.size());
        assertEquals("First cell is a mine", '*', mineField.get(0).value);
    }

}
