class Solution {
    public static int maximum(int [] nums)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        return max;
    }
    public int dominantIndex(int[] nums) 
    {
    int index=0,k=0;
    int m= maximum(nums);
    for(int i=0;i<nums.length;i++)
    {
        if(m==nums[i])
        {
            index=i;
            continue;
        }
        if(m<nums[i]*2)
        {
            return -1;
        }
        
    } 
    return index;
}
}