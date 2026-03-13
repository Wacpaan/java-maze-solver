package com.maze.solver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.maze.entity.*;

public class MazeSolver {



  /*    DFS METHOD        */

    public void solver(Maze maze){
        search(maze, 1, 1);
    }

    private boolean search(Maze maze, int row, int col){
        Cell cell = maze.getGrid()[row][col];
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

      if(row == maze.getMazeHeight()-2 && col == maze.getMazeWidth()-2){
        System.out.println("-----------------");
        System.out.println("      FOUND      ");
        System.out.println("-----------------");
        cell.setPath(true);
        return true;
      }

        cell.setVisited(true);

      for(int i = 0; i < 4; i++){
        int newRow = row + dr[i];
        int newCol = col + dc[i];

        if(newRow >= 0 && newRow < maze.getMazeHeight() && newCol >= 0 && newCol < maze.getMazeWidth() && !maze.getGrid()[newRow][newCol].isVisited() && !maze.getGrid()[newRow][newCol].getWall())
        if(search(maze,newRow,newCol)){
          cell.setPath(true);
          return true;
        }
      }

      return false;
    }

}


