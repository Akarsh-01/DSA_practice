class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]==0)
                {
                    changerow(matrix, i);
                    changecol(matrix, j);
                }

            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-10)
                matrix[i][j]=0;
            }
        }        
    }
    public void changerow(int[][] matrix, int row)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if (matrix[row][j]!=0)
            matrix[row][j]=-10;
        }
    }
    public void changecol(int[][] matrix, int col)
    {
        for(int j=0;j<matrix.length;j++)
        {
            if (matrix[j][col]!=0)
            matrix[j][col]=-10;
        }
    }
}