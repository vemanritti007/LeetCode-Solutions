class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int a=0,b=mat.length-1,sum=0;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][i]+mat[a][b];
            a++;
            b--;
        }
        if(mat.length%2==0)
        {
            return sum;
        }
        return sum-mat[(mat.length-1)/2][(mat.length-1)/2];
    }
}