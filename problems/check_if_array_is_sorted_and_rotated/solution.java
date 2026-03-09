class Solution {
    public static int check_Sort(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1)%nums.length])
            {
                c++;
            }
        }
        return c;
    }
    public boolean check(int[] nums) 
    {
        if(check_Sort(nums)<=1)
        {
            return true;
        }
        return false;
    }
}