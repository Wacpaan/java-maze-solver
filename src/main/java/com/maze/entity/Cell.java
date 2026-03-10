package com.maze.entity;

public class Cell {
    private boolean wallTop = true;
    private boolean wallBottom = true;
    private boolean wallLeft = true;
    private boolean wallRight = true;

    private boolean visited = false;

    public boolean getWallTop() {return wallTop; }
    public void setWallTop(boolean wallTop) { this.wallTop = wallTop;}

    public boolean getWallBottom() {return wallBottom;}
    public void setWallBottom(boolean wallBottom) { this.wallBottom = wallBottom; }

    public boolean getWallLeft() {return wallLeft; }
    public void setWallLeft(boolean wallLeft) { this.wallLeft = wallLeft; }
    
    public boolean getWallRight() { return wallRight; }
    public void setWallRight(boolean wallRight) { this.wallRight = wallRight; }

    public boolean isVisited() {return visited; }
    public void setVisited( boolean visited ) { this.visited = visited;}
}
