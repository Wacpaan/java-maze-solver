package com.maze;
import com.maze.entity.Maze;
import com.maze.renderer.MazeRenderer;
import com.maze.generator.*;
import com.maze.solver.*;

public class App 
{
    public static void main( String[] args )
    {
        Maze maze = new Maze(25,25);
        MazeRenderer renderer = new MazeRenderer();
        MazeGenerator generator = new MazeGenerator();
        MazeSolver solver = new MazeSolver();
        generator.generator(maze);
        maze.resetVisited();
        solver.solver(maze);
        renderer.render(maze);
    }
}
