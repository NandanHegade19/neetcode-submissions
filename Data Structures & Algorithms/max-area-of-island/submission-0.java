class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfsMaxArea(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    public int dfsMaxArea(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length ||
         j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
         }

         grid[i][j] = 0;
         return 1+ dfsMaxArea(grid, i+1, j)
                 + dfsMaxArea(grid, i-1, j)
                 + dfsMaxArea(grid, i, j+1)
                 + dfsMaxArea(grid, i, j-1);
    }

}
