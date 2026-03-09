class Solution {
    public static void reverse(int[] row)
    {
        int temp,i=0,j=row.length-1;
        while(i<=j)
        {
            temp=row[i];
            row[i]=row[j];
            row[j]=temp;
            i++;
            j--;
        }
    }
    public static void transpose(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) 
    {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }
    }
}