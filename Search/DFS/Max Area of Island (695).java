 public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int area = getArea(grid,i,j,visited,0);
                    if(area > maxArea){
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }
    
    private int getArea(int[][] grid, int sr,int sc,boolean[][] visited,int area){
        if(sr >=0 && sr < grid.length && sc >=0 && sc<grid[0].length){
            if(grid[sr][sc] == 1){
            if(!visited[sr][sc]){
                visited[sr][sc] = true;
                area += getArea(grid,sr-1,sc,visited,0);
                area += getArea(grid,sr+1,sc,visited,0);
                area += getArea(grid,sr,sc-1,visited,0);
                area += getArea(grid,sr,sc+1,visited,0);
                return area + 1;
            }
        }
        }
        return 0;
    }