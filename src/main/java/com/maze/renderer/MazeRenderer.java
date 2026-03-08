package com.maze.renderer;
import com.maze.entity.Maze;
public class MazeRenderer {
    
    public void render(Maze maze){
        for(int x = 0; x < maze.getMazeHeight(); x++){
            for(int y = 0; y < maze.getMazeWidth(); y++){
                System.out.print(maze.getGrid()[x][y]);
            }
                System.out.println("");
    }
}
}