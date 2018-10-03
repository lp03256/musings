import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MineFieldReaderTest {
    
    @Test
    public void canInitializeMineFieldFromFile() throws IOException {
        String path = getClass().getClassLoader().getResource("mines.ini").getPath();
        char [][] board = initialiseMineField(path);
        assertEquals("Mine field size is 3X3", 3, board.length);
        assertEquals('.',board[0][1]);
    }


    private char[][] initialiseMineField(String pathToMineFieldFile) throws IOException{
        String [] size = Files.lines(new File(pathToMineFieldFile).toPath()).findFirst().get().split(" ");
        char [][] board = new char [Integer.parseInt(size[0])][Integer.parseInt(size[0])];
        List<String> mineLayout = new ArrayList<String>();
        try (Stream<String> lines = Files.lines(Paths.get(pathToMineFieldFile))) {
            mineLayout = lines.skip(1).collect(Collectors.toList());
        }
        for(int i = 0; i < board.length; i++ ){
            String line = mineLayout.get(i);
            board[i] = line.replaceAll("\\s+","").toCharArray();
        }
        return board;
    }


}
