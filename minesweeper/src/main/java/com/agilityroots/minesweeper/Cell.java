package com.agilityroots.minesweeper;

public class Cell implements Comparable<Coordinate> {

    public final Coordinate coordinate;

    public final char value;

    public Cell(Coordinate coordinate, char value){
        this.coordinate = coordinate;
        this.value = value;
    }

    @Override
    public int compareTo(Coordinate toCompare) {
        if(coordinate.x == toCompare.x && coordinate.y == toCompare.y)
            return 0;
        else if (coordinate.x < toCompare.x)
            return -1;
        else if (coordinate.x > toCompare.x)
            return 1;
        else
            return 1;
    }
}
