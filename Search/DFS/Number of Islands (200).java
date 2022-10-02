 public int numIslands(char[][] grid) {
        boolean[][] checked = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !checked[i][j]){
                    ++count;
                    dfs(grid,j,i,checked);
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid,int sc, int sr, boolean[][] checked){
        if(sr >= 0 && sr < grid.length && sc >= 0 && sc<grid[0].length){
            if(grid[sr][sc] == '1' && !checked[sr][sc]){
                checked[sr][sc] = true;
                dfs(grid,sc-1,sr,checked);
                dfs(grid,sc,sr-1,checked);
                dfs(grid,sc+1,sr,checked);
                dfs(grid,sc,sr+1,checked);
            }
        }
    }