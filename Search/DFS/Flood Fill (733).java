 public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         if(color != image[sr][sc]){
            depthFirstSearch(image,sr,sc,color,image[sr][sc]);
        }        
        return image;
    }
    
    private void depthFirstSearch(int[][] resArr, int sr, int sc, int target, int colorToCheck){
        if(sr >= 0 && sr < resArr.length && sc >= 0 && sc < resArr[0].length){
            if(resArr[sr][sc] == colorToCheck){
                resArr[sr][sc] = target;
                depthFirstSearch(resArr,sr,sc-1,target,colorToCheck);
                depthFirstSearch(resArr,sr-1,sc,target,colorToCheck);
                depthFirstSearch(resArr,sr,sc+1,target,colorToCheck);
                depthFirstSearch(resArr,sr+1,sc,target,colorToCheck);
            }
        }
    }