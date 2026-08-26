class Solution {
    public int numberOfSubmatrices(char[][] grid) {
       int m = grid.length,n=grid[0].length,count=0;
       int colPrefix[] = new int[n]; //keeps prefix sum over coloumn
       int xcount[] = new int[n];  //Keeps track of x's in each coloumn
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]=='X'){
                colPrefix[j]++;
                xcount[j]++;
            }
            else if(grid[i][j]=='Y'){
                colPrefix[j]--;
            }
        }
        int sum=0,totalx=0;
        for(int j=0;j<n;j++)
        {
            sum+=colPrefix[j];
            totalx+=xcount[j];
            if(sum==0 && totalx>0)count++;
        }
        }
        return count;
       }
    }
