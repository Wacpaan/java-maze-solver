package com.maze;
import com.maze.entity.Maze;
import com.maze.renderer.MazeRenderer;
import com.maze.generator.*;

public class App 
{
    public static void main( String[] args )
    {
        Maze maze = new Maze(25,25);
        MazeRenderer renderer = new MazeRenderer();
        MazeGenerator generator = new MazeGenerator();
        generator.generator(maze);
        renderer.render(maze);
    }
}
