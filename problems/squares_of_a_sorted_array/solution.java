class Solution {
    public static int[] reverse(int[] nums)
    {
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
    public int[] sortedSquares(int[] nums) 
    {
     int l=0,r=nums.length-1,k=0;
     int[] ans = new int[nums.length];
     while(l<=r)
     {
        if(Math.abs(nums[l])>=Math.abs(nums[r]))
        {
            ans[k]=nums[l]*nums[l];
            l++;
            k++;
        }
        else
        {
            ans[k]=nums[r]*nums[r];
            r--;
            k++;
        }
     }
    
    return reverse(ans);   
    }
    
}