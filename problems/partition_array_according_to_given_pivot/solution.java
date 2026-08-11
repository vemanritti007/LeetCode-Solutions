class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n = nums.length;
        int less=0;
        int high=n-1;
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)ans[less++]=nums[i];
        }
        for(int j=n-1;j>=0;j--)
        {
            if(nums[j]>pivot)ans[high--]=nums[j];
        }
        while(less<=high)
        {
            ans[less++]=pivot;
        }
        return ans;
    }
}