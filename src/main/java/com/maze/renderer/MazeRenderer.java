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
        for(int x = 0; x < (maze.getMazeHeight()*2+1); x++){

                for(int y = 0; y < (maze.getMazeWidth()*2+1); y++){

                    if(x % 2 == 0 && y % 2 == 0){System.out.print("#");}
                    else {
                        int row = x / 2;
                        int col = y / 2;
                        if( x % 2 == 0 && y % 2 != 0){
                            Cell cell = maze.getGrid()[row][col];
                            {if (cell.getWallTop() == true){System.out.print("#");} else { System.out.print(" "); }}                        
                    }  else if ( x % 2 != 0 && y % 2 == 0 ) {
                        Cell cell = maze.getGrid()[row][col];
                        if (cell.getWallLeft()){ System.out.print("#");} else {System.out.print(" ");}
                    }   else {
                        System.out.print(" ");
                    }
                }
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