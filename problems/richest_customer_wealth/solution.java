class Solution 
{
    public static void prefix(int[][] arr,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static int maximum(int [][] arr,int m,int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            if(max<arr[i][n-1])
            {
                max=arr[i][n-1];
            }
        }
        return max;
    }
    public int maximumWealth(int[][] accounts) 
    {
        prefix(accounts,accounts.length,accounts[0].length);
        return maximum(accounts,accounts.length,accounts[0].length);
    }
}