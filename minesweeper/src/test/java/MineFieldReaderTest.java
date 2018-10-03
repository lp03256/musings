import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class MineFieldReaderTest {

    @Before
    public void setUp() throws IOException{
        FileWriter fileWriter = new FileWriter("mines.ini");
        fileWriter.write("3 3" + System.getProperty("line.separator") );
        fileWriter.write("* . ." + System.getProperty("line.separator") );
        fileWriter.write(". * ." + System.getProperty("line.separator") );
        fileWriter.write(". . ." + System.getProperty("line.separator") );
        fileWriter.close();
    }

    @After
    public void tearDown() throws IOException {
        new File("mines.ini").delete();
    }

    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        char [][] board = initialiseMineField("mines.ini");
        assertEquals("Mine field size is 3X3", 3, board.length);
        assertEquals('.',board[0][1]);
    }


    private char[][] initialiseMineField(String pathToMineFieldFile) throws IOException{
        String [] size = Files.lines(new File(pathToMineFieldFile).toPath()).findFirst().get().split(" ");
        char [][] board = new char [Integer.parseInt(size[0])][Integer.parseInt(size[0])];
        return board;
    }


}
