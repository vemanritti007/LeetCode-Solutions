class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) 
    {
        int m= matrix.length;
        int n= matrix[0].length;
         for(int i=m-1;i>=1;i--)
         {
            for(int j=n-1;j>=1;j--)
            {
                if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    return false;
                }
            }
         }  
         return true; 
    }
}