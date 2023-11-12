class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] new_row = new int[rows];
        int[] new_col = new int[cols];

        for(int i=0;i<rows;i++)
        {
            int max = 0;
            for(int j=0;j<cols;j++)
            {
                max = Math.max(grid[i][j],max);
            }
            new_row[i] = max;
        }

        for(int i=0;i<cols;i++)
        {
            int max = 0;
            for(int j=0;j<rows;j++)
            {
                max = Math.max(grid[j][i],max);
            }
            new_col[i] = max;
        }
        int ans = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                int max = Math.min(new_row[i],new_col[j]);
                if(grid[i][j]<max) 
                ans = ans+max-grid[i][j];
            }
        }
        return ans;
    }
}
