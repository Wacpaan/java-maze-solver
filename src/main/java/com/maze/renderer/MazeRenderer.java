package com.maze.renderer;
import com.maze.entity.*;
public class MazeRenderer {
    

    /*
        cell 1x1
        ###
        # #
        ###
    */
   
    public void render(Maze maze){
        for(int x = 0; x < maze.getMazeHeight(); x++){
            for(int y = 0; y < maze.getMazeWidth(); y++){
                Cell cell = maze.getGrid()[x][y];
                if(cell.getWall()){ System.out.print("#"); }
                else { System.out.print(" "); }
            }
            System.out.println();
        }
}
}


/*
00  01  02
#   #   #
10  11  12
#   #    #
20  21  22
#   #   #
*/