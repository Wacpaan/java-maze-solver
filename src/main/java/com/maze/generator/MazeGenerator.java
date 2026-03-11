package com.maze.generator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.maze.entity.Cell;
import com.maze.entity.Maze;
public class MazeGenerator {

    public void generator(Maze maze){
        carve(maze, 0, 0);

    }

    private void carve(Maze maze, int row, int col){
        Cell cell = maze.getGrid()[row][col];
        
        cell.setWall(false);
        cell.setVisited(true);
    
        int[] dr = {-2, 2, 0, 0}; 
        int[] dc = {0, 0, -2, 2};
        List<Integer> kierunki = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

        Collections.shuffle(kierunki);

        for(int i : kierunki){
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if(newRow >= 0 && newRow < maze.getMazeHeight() && newCol >= 0 && newCol < maze.getMazeWidth() && !maze.getGrid()[newRow][newCol].isVisited()){
               Cell wall = maze.getGrid()[row + dr[i]/2][col + dc[i]/2];
               wall.setWall(false);
               carve(maze, newRow, newCol);
            }
        }
    }
}
