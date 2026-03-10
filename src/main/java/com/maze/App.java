package com.maze;
import com.maze.entity.Maze;
import com.maze.renderer.MazeRenderer;

public class App 
{
    public static void main( String[] args )
    {
        Maze maze = new Maze(5,5);
        MazeRenderer renderer = new MazeRenderer();
        renderer.render(maze);
    }
}
