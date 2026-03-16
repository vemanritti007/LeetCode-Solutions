class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
    ArrayList<Integer> l1 = new ArrayList<>();
     int m = matrix.length;
     int n = matrix[0].length;
     int topr=0,bottomr=m-1;
     int rightc=n-1,leftc=0;
     int total=0;
     while(total<m*n)
     {
        for(int i=leftc;i<=rightc && total<m*n;i++)
        {
            l1.add(matrix[topr][i]);
            total++;
        }
        topr++;
        for(int i=topr;i<=bottomr && total<m*n;i++)
        {
            l1.add(matrix[i][rightc]);
            total++;
        }
        rightc--;
        for(int i=rightc;i>=leftc && total<m*n;i--)
        {
            l1.add(matrix[bottomr][i]);
            total++;
        }
        bottomr--;
        for(int i=bottomr;i>=topr && total<m*n;i--)
        {
            l1.add(matrix[i][leftc]);
            total++;
        }
        leftc++;
     }   
     return l1;
    }
}