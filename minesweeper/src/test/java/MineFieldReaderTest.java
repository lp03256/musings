import org.junit.Test;
import java.io.IOException;


import static org.junit.Assert.*;

public class MineFieldReaderTest {

    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        String path = getClass().getClassLoader().getResource("mines.ini").getPath();
        MineFieldReader mineFieldReader = new MineFieldReader();
        char [][] board = mineFieldReader.initialiseMineField(path);
        assertEquals("Mine field size is 3X3", 3, board.length);
        assertEquals('.',board[0][1]);
    }

}
