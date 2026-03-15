class Solution {
    public static int minRow(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static int maxCol(int[][] matrix,int j)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][j]>max)
            {
                max=matrix[i][j];
            }
        }
        return max;
    }
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        int a,b;
        for(int i=0;i<matrix.length;i++)
        {
            a=minRow(matrix[i]);
            l1.add(a);
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            b=maxCol(matrix,j);
            l2.add(b);
        }
        if(l1.size()>=l2.size())
        {
        for(int i=0;i<l1.size();i++)
        {
            if(l2.contains(l1.get(i)))
            {
                l3.add(l1.get(i));
            }
        }
        }
        else{
            for(int i=0;i<l2.size();i++)
        {
            if(l1.contains(l2.get(i)))
            {
                l3.add(l2.get(i));
            }
        }
        }
        return l3;
    }
}