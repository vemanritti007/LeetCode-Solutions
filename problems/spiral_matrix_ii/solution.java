class Solution {
    public int[][] generateMatrix(int n) 
    {
        int ans[][] = new int[n][n];
        int total=1;
        int topr=0,bottomr=n-1;
        int leftc=0,rightc=n-1;
        while(total<=n*n)
        {
            for(int i=leftc;i<=rightc && total<=n*n;i++)
            {
                ans[topr][i]=total;
                total++;
            }
            topr++;
            for(int i=topr;i<=bottomr && total<=n*n;i++)
            {
                ans[i][rightc]=total;
                total++;
            }
            rightc--;
            for(int i=rightc;i>=leftc && total<=n*n;i--)
            {
                ans[bottomr][i]=total;
                total++;
            }
            bottomr--;
            for(int i=bottomr;i>=topr && total<=n*n;i--)
            {
                ans[i][leftc]=total;
                total++;
            }
            leftc++;
        } 
       
        return ans;
    }
}