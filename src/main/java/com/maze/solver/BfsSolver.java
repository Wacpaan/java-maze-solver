package com.maze.solver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
import com.maze.entity.*;

public class BfsSolver {

    public void solver(Maze maze){
      Queue<int[]> queue = new ArrayDeque<>();

      queue.add(new int[]{1, 1});
      maze.getGrid()[1][1].setVisited(true);

      while (!queue.isEmpty()){
        int[] current = queue.poll();
        int row = current[0];
        int col = current[1];
      }
    }


  
}
