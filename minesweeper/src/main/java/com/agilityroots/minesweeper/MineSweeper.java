package com.agilityroots.minesweeper;

import java.util.*;

public class MineSweeper {


    private Collection<Coordinate> coordinates = Arrays.asList(
            new Coordinate(-1, -1), // left top
            new Coordinate(-1, 0), // left middle
            new Coordinate(-1, +1), // left bottom
            new Coordinate(0, -1), // top
            new Coordinate(0, +1), // bottom
            new Coordinate(+1, -1), // right top
            new Coordinate(+1, 0), // right middle
            new Coordinate(+1, +1)  // right bottom
    );

    public List<Cell> solve(List<Cell> mineField) {

        for (Cell cell : mineField.toArray(new Cell[mineField.size()])) {
            if (cell.value == '*') {
                Collection<Coordinate> neighbours = getNearCoordinates(cell.coordinate);
                for (Coordinate neighbour : neighbours) {
                    int index = Collections.binarySearch(mineField, neighbour);
                    if (index != -1 && mineField.get(index).value != '*' && mineField.get(index).value != '.')
                        mineField.add(index, new Cell(neighbour, Character.forDigit(Integer.parseInt(String.valueOf(mineField.get(index).value)) + 1, 10)));
                    else
                        mineField.add(index, new Cell(neighbour, '1'));
                }
            }
        }

        return mineField;
    }


    private Collection<Coordinate> getNearCoordinates(Coordinate origin) {
        Collection<Coordinate> neighbours = new ArrayList<>();

        for (Coordinate direction : coordinates)
            neighbours.add(origin.move(direction));

        return neighbours;
    }
}
