package com.maze.entity;
public class Maze {
    private int mazeHeight, mazeWidth;
    private Cell[][] grid;

    public Maze(int mazeHeight, int mazeWidth){
        this.mazeHeight = mazeHeight;
        this.mazeWidth = mazeWidth;
        this.grid = new Cell[mazeHeight][mazeWidth];

    for(int x = 0; x < mazeHeight; x++){
        for(int y = 0; y < mazeWidth; y++){
        grid[x][y] = new Cell();
        }
    }
    }
    public void resetVisited(){
      for(int i = 0; i < mazeHeight; i++){
        for(int j = 0; j < mazeWidth; j ++){
          grid[i][j].setVisited(false);
        }
      }

    }

    //Gettery

    public int getMazeHeight() { return mazeHeight; }

    public int getMazeWidth() {return mazeWidth; }

    public Cell[][] getGrid() { return grid; }
}
