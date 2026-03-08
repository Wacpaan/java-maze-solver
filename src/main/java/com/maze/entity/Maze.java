package com.maze.entity;

public class Maze {
    private int mazeHeight, mazeWidth;
    char[][] grid;

    public Maze(int mazeHeight, int mazeWidth){
        this.mazeHeight = mazeHeight;
        this.mazeWidth = mazeWidth;
        this.grid = new char[mazeHeight][mazeWidth];

    for(int x = 0; x < mazeHeight; x++){
        for(int y = 0; y < mazeWidth; y++){
        grid[x][y] = '#';
        }
    }

    }

    //Gettery

    public int getMazeHeight() { return mazeHeight; }

    public int getMazeWidth() {return mazeWidth; }

    public char[][] getGrid() { return grid; }
}
