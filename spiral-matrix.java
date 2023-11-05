class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int min_row = 0;
        int max_row = matrix.length-1;
        int min_col = 0;
        int max_col = matrix[0].length-1;
        ArrayList<Integer> answer = new ArrayList<Integer>(matrix[0].length*matrix[0].length);
        int total = matrix.length * matrix[0].length;
        int count =0;
        
        while(min_col<=max_col && min_row<=max_row)
        {
            for(int i=min_col;i<=max_col;i++)
            {
                answer.add(matrix[min_row][i]);
            }
            min_row++;
            for(int j=min_row;j<=max_row;j++)
            {
                answer.add(matrix[j][max_col]);
            }
            max_col--;

            if(min_row<=max_row){
                for(int i=max_col;i>=min_col;i--)
                {
                    answer.add(matrix[max_row][i]);
                }
                max_row--;
            }

            if(min_col<=max_col){
                for(int i=max_row;i>=min_row;i--)
                {
                    answer.add(matrix[i][min_col]);
                }
                min_col++;
            }
        }
        return answer;
    }
}
