class Solution {
    public static void flip(int [] a,int n)
    {
        int i=0,j=n-1;
        while(i<j){
        swap(i,j,a);
        i++;
        j--;
        }
        invert(a,n);
    }
    public static void invert(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                a[i]=0;
            }
            else a[i]=1;
        }
    }
    public static void swap(int i,int j,int[] a)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++)
        {
            flip(image[i],n);
        }
        return image;
    }
}