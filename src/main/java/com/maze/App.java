package com.maze;
import com.maze.entity.Maze;
import com.maze.renderer.MazeRenderer;
import com.maze.generator.*;
import com.maze.solver.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("==========Hi!==========");
        System.out.println("-----------------------");
        System.out.println("Welcome in Maze solver!");
        System.out.println("-----------------------");
        System.out.print("Which size of grid you want?: ");
        int gridSize = scan.nextInt();

        // Main program 

        Maze maze = new Maze(gridSize,gridSize);
        MazeRenderer renderer = new MazeRenderer();
        MazeGenerator generator = new MazeGenerator();
        MazeSolver solver = new MazeSolver();
        generator.generator(maze);
        renderer.render(maze);
        maze.resetVisited();
        solver.solver(maze);
        renderer.render(maze);
    }
}
