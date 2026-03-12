package com.maze.solver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.maze.entity.*;

public class MazeSolver {

    public void solver(Maze maze){
        search(maze, 1, 1);
    }

    private boolean search(Maze maze, int row, int col){
        Cell cell = maze.getGrid()[row][col];

        cell.setVisited(true);

        int[] dr = {-1 , 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        List<Integer> kierunki = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

        if(cell.isVisited()){
            System.out.print("*");
        }

        return true;
    }

}