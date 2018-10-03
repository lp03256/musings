package com.agilityroots.minesweeper;

public class Coordinate {

    public final int x;
    public final int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordinate move(Coordinate vector) {
        return new Coordinate( x + vector.x, y + vector.y);
    }
}
