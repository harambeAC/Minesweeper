
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class GameModel {
    
    public static final int WIDTH = 5;
    public static final int HEIGHT = 5;
    
    public static final int NUMMINES = 1;
            
    public int[][] grid;
    public boolean[][] revealed;
    
    // if it is revealed, it will be True, else it will be false
    
    /*
     * -1 means there is a mine at the location
     * 0 means an empty space
     * >0 means there is a mine in one of the adjacent spaces
     */
    
    public boolean gameOver;
    
    
    public GameModel() {
        grid = new int[HEIGHT][WIDTH];
        revealed = new boolean[HEIGHT][WIDTH];
        
        for(int i = 0; i<NUMMINES; i++) {
        		// x and y are between 0 and 50
        		int x = (int)(Math.random()*WIDTH);
        		int y = (int)(Math.random()*HEIGHT);
        		
        		if(grid[x][y] != -1) {
        			grid[x][y] = -1;
        		} else {
        			i--;
        		}
        }
        
        for(int i = 0; i<grid.length; i++) {
        		for(int j = 0; j<grid[0].length; j++) {
        			
        			if(grid[i][j] == -1) {
        				continue;
        			}
        			
        			int score = 0;
        			if(
        			(i < WIDTH-1 && grid[i+1][j] == -1) ||
        			(j < HEIGHT-1 && grid[j][j+1] == -1) ||
        			(i < WIDTH-1 && j < HEIGHT-1 && grid[i+1][j+1] == -1) ||
        			(i > 0 && grid[i-1][j] == -1) ||
        			(j > 0 && grid[i][j-1] == -1) || 
        			(i > 0 && j > 0 && grid[i-1][j-1] == -1)){       				
        				score++;
        			}
        			grid[i][j] = score;
        		}
        }
        
        System.out.println(Arrays.deepToString(grid));
    }
    
}