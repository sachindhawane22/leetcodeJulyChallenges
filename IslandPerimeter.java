
class Solution {
    /*public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }*/
    
     public int islandPerimeter(int[][] grid) 
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                int t=0;
                if(grid[i][j]==1)
                {
                    t=4;
                    if(i>=1 && grid[i-1][j]==1)
                        t--;
                    if(i<grid.length-1 && grid[i+1][j]==1)
                        t--;
                    if(j>=1 && grid[i][j-1]==1)
                        t--;
                    if(j<grid[i].length-1 && grid[i][j+1]==1)
                        t--;
                    
                    count=count+t;
                        
                }
            }
        }
        return count;
        
    }
}
