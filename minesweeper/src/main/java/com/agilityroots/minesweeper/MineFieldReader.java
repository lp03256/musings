package com.agilityroots.minesweeper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MineFieldReader {

    public List<Cell> initialiseMineField(String pathToMineFieldFile) throws IOException {
        List<String> layout;
        List<Cell> mineField = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(pathToMineFieldFile))) {
           layout  = lines.skip(1).collect(Collectors.toList());
        }
        int cursor = 0;
        for (String line : layout) {
            char [] elements = line.replaceAll("\\s+","").toCharArray();
            for (int i = 0; i < elements.length; i++) {
                mineField.add(new Cell(new Coordinate(cursor, i),elements[i]));
            }
            cursor++;
        }
        return mineField;
    }
}
