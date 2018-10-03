import org.junit.Test;

import static org.junit.Assert.*;

public class MineFieldReaderTest {

    @Test
    public void canInitialiseMineField(){

        char [][] board = initialiseMineField("3 3");
        assertEquals("Mine field size is 3X3", 3, board.length);
    }
}