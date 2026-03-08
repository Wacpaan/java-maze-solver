package com.maze.entity;

public class Maze {
    private int mazeHeight, mazeWidth;
    char[][] grid;
    
    public Maze(int mazeHeight, int mazeWidth){
        this.mazeHeight = mazeHeight;
        this.mazeWidth = mazeWidth;
        this.grid = new char[mazeHeight][mazeWidth];
    }

    //Gettery

    public int getMazeHeight() { return mazeHeight; }

    public int getMazeWidth() {return mazeWidth; }

}
