import org.junit.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class MineFieldReaderTest {

    @Test
    public void canInitialiseMineField() {

        char [][] board = initialiseMineField("3 3");
        assertEquals("Mine field size is 3X3", 3, board.length);
    }

    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        FileWriter fileWriter = new FileWriter("mines.ini");
        fileWriter.write("3 3" + System.getProperty("line.separator") );
        fileWriter.close();
        assertEquals("First Line of file is 3 3", "3 3", readMineFieldFile("mines.ini"));
    }

    private char[][] initialiseMineField(String dimensions) {
        String [] size = dimensions.split(" ");
        return new char [Integer.parseInt(size[0])][Integer.parseInt(size[0])];
    }

    private String readMineFieldFile(String pathToMineFieldFile) throws IOException {
        return Files.lines(new File(pathToMineFieldFile).toPath()).findFirst().get();
    }
}
