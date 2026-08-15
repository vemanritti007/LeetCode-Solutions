class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int zeroes=0;
        int n = nums.length;
        int max=Integer.MIN_VALUE;
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)zeroes++;
            while(zeroes>k)
            {
                if(nums[left]==0) zeroes--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }  
        return max;  
    }
}