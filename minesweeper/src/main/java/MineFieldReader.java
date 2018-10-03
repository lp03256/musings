import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MineFieldReader {

    public char[][] initialiseMineField(String pathToMineFieldFile) throws IOException {
        String [] size = Files.lines(new File(pathToMineFieldFile).toPath()).findFirst().get().split(" ");
        char [][] board = new char [Integer.parseInt(size[0])][Integer.parseInt(size[0])];
        List<String> mineLayout;
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
