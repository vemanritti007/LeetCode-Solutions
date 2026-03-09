class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
     if(mat.length*mat[0].length!=r*c)
     {
        return mat;
     }   
     int reshape[][]=new int[r][c];
     int a=0,b=0;
     for(int i=0;i<mat.length;i++)
     {
        for(int j=0;j<mat[0].length;j++)
        {
            reshape[a][b]=mat[i][j];
            b++;
            if(b==c)
            {
                a++;
                b=0;
            }
        }
      
     }
     return reshape;
    }
}