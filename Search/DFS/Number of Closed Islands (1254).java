 public int closedIsland(int[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    if(isClosed(grid,i,j)){
                     ++count;   
                    }
                }
            }
        }
        return count;
    }
    private boolean isClosed(int[][] grid, int sr, int sc){
        if(sr >= 0 && sr < grid.length && sc >=0 && sc < grid[0].length){
            boolean result = true;
            if(grid[sr][sc] == 0){
                grid[sr][sc] = 2;
                result =  isClosed(grid, sr-1,sc) && result;
                result =  isClosed(grid, sr+1,sc) && result;
                result =  isClosed(grid, sr,sc-1) && result;
                result =  isClosed(grid, sr,sc+1) && result ; 
            }
             return result;
        }
        return false;
    }