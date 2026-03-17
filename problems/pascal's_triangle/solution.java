class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        int p[][] = new int[numRows][];
        for(int i=0;i<numRows;i++)
        {
            p[i] = new int[i+1];
            for(int j=0;j<p[i].length;j++)
            {
                if(j==0 || i==j)
                {
                    p[i][j]=1;
                }
                else p[i][j]=p[i-1][j]+p[i-1][j-1];
            }
        }
        for(int i=0;i<numRows;i++)
        {
            list.add(new ArrayList<Integer>());
            for(int j=0;j<i+1;j++)
            {
                list.get(i).add(p[i][j]);
            }
        }
        return list;
    }
}