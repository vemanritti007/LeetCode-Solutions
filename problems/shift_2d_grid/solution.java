class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        List<List<Integer>> list = new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        int temp,prev;
        k=k%(m*n);
        for(int c=0;c<k;c++)
        {
            prev=grid[m-1][n-1];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                temp=grid[i][j];
                grid[i][j]=prev;
                prev=temp;
                }
            }
        } 
        for(int i=0;i<m;i++)
        {
            list.add(new ArrayList<Integer>());
            for(int j=0;j<n;j++)
            {
                list.get(i).add(grid[i][j]);
            }
        } 
        return list;  
    }
}