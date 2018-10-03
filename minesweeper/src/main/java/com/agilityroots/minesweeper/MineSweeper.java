package com.agilityroots.minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MineSweeper {


    private Collection<Cell> coordinates = Arrays.asList(
            new Cell(-1, -1), // left top
            new Cell(-1, 0), // left middle
            new Cell(-1, +1), // left bottom
            new Cell(0, -1), // top
            new Cell(0, +1), // bottom
            new Cell(+1, -1), // right top
            new Cell(+1, 0), // right middle
            new Cell(+1, +1)  // right bottom
    );

    public char[][] solve(char[][] mineField) {

        for (int rowCursor = 0; rowCursor < mineField.length; rowCursor++) {
            for (int colCursor = 0; colCursor < mineField[rowCursor].length; colCursor++) {
                if (mineField[rowCursor][colCursor] == '*') {
                    Collection<Cell> neighbours = getNearCoordinates(new Cell(rowCursor, colCursor));
                    neighbours.removeIf(coordinate -> coordinate.x < 0 || coordinate.y < 0);
                    for (Cell neighbour : neighbours) {
                        if (mineField[neighbour.x][neighbour.y] != '*' && mineField[neighbour.x][neighbour.y] != '.') {
                            int count = Integer.parseInt(String.valueOf(mineField[neighbour.x][neighbour.y]));
                            count++;
                            mineField[neighbour.x][neighbour.y] = Character.forDigit(count, 10);
                        }
                        if (mineField[neighbour.x][neighbour.y] == '.')
                            mineField[neighbour.x][neighbour.y] = '1';
                    }
                }
            }
        }

        return mineField;
    }


    private Collection<Cell> getNearCoordinates(Cell origin) {
        Collection<Cell> neighbours = new ArrayList<>();
        for (Cell direction : coordinates)
            neighbours.add(origin.move(direction));
        return neighbours;
    }
}
