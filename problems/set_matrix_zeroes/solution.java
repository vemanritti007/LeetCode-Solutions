class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int row[] = new int[r];
        int coloumn[] = new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    coloumn[j]=1;
                }
            }
        }    
        for(int i=0;i<r;i++)
        {
            if(row[i]==1)
            {
                for(int j=0;j<c;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            if(coloumn[i]==1)
            {
                for(int j=0;j<r;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}