class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        if(nums.length==1 && nums[0]>=k)return 0;
        if(nums.length==1 && nums[0]<k) return 1;
        int left=0,prod=1,count=0;
        for(int right=0;right<nums.length;right++)
        {
            prod*=nums[right];
            while(prod>=k)
            {
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
        } 
        return count;   
    }
}