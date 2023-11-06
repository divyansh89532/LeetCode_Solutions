class Solution {
    public int minPathSum(int[][] grid) {
        // dp[i][j] = grid[i][j] + min(dp[i-1][j] , dp[i][j-1])
        // int row = grid.length;
        // int col = grid[0].length;
        // int[][]dp = new int[row][col];
        // dp[0][0] = grid[0][0]
        // for(int i = 1;i<col;i++)
        // {
        //     dp[0][i] = dp[0][i-1] + grid[0][i];
        // }


        if(grid == null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int rows = grid.length;
        int colums = grid[0].length;
        int[][]dp = new int[rows][colums];
        dp[0][0] = grid[0][0];
        for(int i=1;i<rows;i++)
        {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }

        for(int i=1;i<colums;i++)
        {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<colums;j++)
            {
               dp[i][j] = grid[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[rows-1][colums-1];
    }
}
