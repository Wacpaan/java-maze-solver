package com.maze.entity;

public class Maze {
    private int mazeHeight, mazeWidth;

    public Maze(int mazeHeight, int mazeWidth){
        this.mazeHeight = mazeHeight;
        this.mazeWidth = mazeWidth;
    }

    //Gettery

    public int getMazeHeight() { return mazeHeight; }

    public int getMazeWidth() {return mazeWidth; }

}
