package com.agilityroots.minesweeper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MineFieldReader {

    public char[][] initialiseMineField(String pathToMineFieldFile) throws IOException {
        List<String> layout;
        char[][] mineField;
        String[] size = Files.lines(new File(pathToMineFieldFile).toPath()).findFirst().get().split(" ");
        mineField = new char[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        try (Stream<String> lines = Files.lines(Paths.get(pathToMineFieldFile))) {
            layout = lines.skip(1).collect(Collectors.toList());
        }
        int cursor = 0;
        for (String line : layout) {
            mineField[cursor] = line.replaceAll("\\s+", "").toCharArray();
            cursor++;
        }
        return mineField;
    }
}
