package com.agilityroots.minesweeper;

public class Cell {

    public final int x;

    public final int y;


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cell move(Cell vector) {
        return new Cell(x + vector.x, y + vector.y);
    }

}
